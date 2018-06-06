package com.revature.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Answer;
import com.revature.beans.Attempt;
import com.revature.beans.Question;

@Repository
@Transactional
@EnableTransactionManagement
public class AnswerRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public Answer getAnswer(int id) {
		Session s = sessionFactory.getCurrentSession();
		Answer answer = (Answer) s.createCriteria(Answer.class).add(Restrictions.eq("id", id)).uniqueResult();
		return answer;
	}

	public List<Answer> getAnswersByQuestion(Question question) {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Answer> answers = (List<Answer>) s.createCriteria(Answer.class).add(Restrictions.eq("question", question))
				.list();
		if(answers == null || answers.isEmpty())
			return null;
		return answers;
	}

	public Answer persistAnswer(Answer f) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(f);
		return f;
	}
}
