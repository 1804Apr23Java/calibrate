package com.revature.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Answer;

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

}
