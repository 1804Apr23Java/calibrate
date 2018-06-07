package com.revature.repository;

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
import com.revature.beans.Status;
import com.revature.service.QuestionService;

@Repository
@Transactional
@EnableTransactionManagement
public class LibraryRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private QuestionService questionService;

	public Library persistLibrary(Library library) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(library);
		return library;
	}

	public Library getLibrary(int id) {
		Session s = sessionFactory.getCurrentSession();
		Library library = (Library) s.createCriteria(Library.class).add(Restrictions.eq("id", id)).uniqueResult();
		return library;
	}

	public List<Library> getLibrariesByAccount(int accountId) {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Library> libraries = (List<Library>) s.createCriteria(Library.class)
				.add(Restrictions.eq("account.id", accountId)).list();
		return libraries;
	}

	public List<Library> getLibrariesByStatus(Status status) {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Library> libraries = (List<Library>) s.createCriteria(Library.class).add(Restrictions.eq("status", status))
				.list();
		return libraries;
	}

	public boolean deleteLibrary(int id) {
		Session s = sessionFactory.getCurrentSession();
		Library library = getLibrary(id);
		List<Question> questions = questionService.getQuestionsByLibrary(id);
		for (Question question : questions) {
			question.setLibrary(null);
			questionService.addQuestion(question);
		}
		if (library != null) {
			s.delete(library);
			return true;
		}
		return false;
	}
}
