package com.revature.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Quiz;

@Repository
@Transactional
@EnableTransactionManagement
public class QuizRepository {

	@Autowired
	SessionFactory sessionFactory;
	
	public Quiz getQuiz(int id) {
		Session s = sessionFactory.getCurrentSession();
		Quiz quiz = (Quiz) s.createCriteria(Quiz.class).add(Restrictions.eq("id", id)).uniqueResult();
		return quiz;
	}
	
}
