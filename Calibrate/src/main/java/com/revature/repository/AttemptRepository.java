package com.revature.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
	SessionFactory sessionFactory;
	
	public Attempt persistAttempt(Attempt f) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(f);
		return f;
	}
}
