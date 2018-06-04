package com.revature.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Question;

@Repository
@Transactional
@EnableTransactionManagement
public class QuestionRepository {

	@Autowired
	SessionFactory sessionFactory;
	
	public Question getQuestion(int id) {
		Session s = sessionFactory.getCurrentSession();
		Question question = (Question) s.createCriteria(Question.class).add(Restrictions.eq("id", id)).uniqueResult();
		return question;
	}
	
}
