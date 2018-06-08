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

import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.service.LibraryService;

@Repository
@Transactional
@EnableTransactionManagement
public class QuestionRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private LibraryService libraryService;
	
	public Question persistQuestion(Question question) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(question);
		return question;
	}
	
	public Question getQuestion(int id) {
		Session s = sessionFactory.getCurrentSession();
		Question question = (Question) s.createCriteria(Question.class).add(Restrictions.eq("id", id)).uniqueResult();
		return question;
	}
	
	public List<Question> getQuestionsByLibrary(Library library) {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Question> questions = (List<Question>)s.createCriteria(Question.class).add(Restrictions.eq("library", library)).list();
		return new ArrayList<Question>(new HashSet<Question>(questions));
	}
	
	public List<Question> getQuestionsByLibraries(List<Integer> libraryIds) {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Question> questions = s.createCriteria(Question.class).add(Restrictions.in("library.id", libraryIds)).list();
		return new ArrayList<Question>(new HashSet<Question>(questions));
	}
	
}
