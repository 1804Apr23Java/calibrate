package com.revature.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Attempt;

@Repository
@Transactional
@EnableTransactionManagement
public class AttemptRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
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
		List<Attempt> attempts = (List<Attempt>) s.createCriteria(Attempt.class).add(Restrictions.eq("account.id", accountId)).list();
		return new ArrayList<Attempt> (new HashSet<Attempt> (attempts));
	}
	
}
