package com.revature.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Account;
import com.revature.beans.Answer;
import com.revature.beans.Attempt;
import com.revature.beans.Quiz;

@Repository
@Transactional
@EnableTransactionManagement
public class AttemptRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public Attempt addAttempt(int accountId, int quizId, List<Integer> answerIds) {
		Session s = sessionFactory.getCurrentSession();
		Account account = (Account) s.load(Account.class, accountId);
		Quiz quiz = (Quiz) s.get(Quiz.class, quizId);
		Set<Answer> answers = new HashSet<Answer>();
		for (int answerId : answerIds)
			answers.add((Answer) s.get(Answer.class, answerId));
		Attempt attempt = new Attempt(account, quiz, answers);
		return persistAttempt(attempt);
	}

	public Attempt getAttempt(int id) {
		Session s = sessionFactory.getCurrentSession();
		Attempt attempt = (Attempt) s.createCriteria(Attempt.class).add(Restrictions.eq("id", id)).uniqueResult();
		return attempt;
	}

	public Attempt persistAttempt(Attempt attempt) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(attempt);
		return attempt;
	}

	public List<Attempt> getAttemptsByAccount(int accountId) {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Attempt> attempts = (List<Attempt>) s.createCriteria(Attempt.class)
				.add(Restrictions.eq("account.id", accountId)).list();
		return new ArrayList<Attempt>(new HashSet<Attempt>(attempts));
	}

}
