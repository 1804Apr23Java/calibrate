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

import com.revature.beans.Account;
import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.beans.Status;
import com.revature.exception.LibraryNotFoundException;

@Repository
@Transactional
@EnableTransactionManagement
public class LibraryRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private QuestionRepository questionRepository;

	public Library persistLibrary(Library library) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(library);
		return library;
	}
	
	public Library addLibrary(String name, int accountId) {
		Session s = sessionFactory.getCurrentSession();
		Account account = (Account) s.load(Account.class, accountId);
		return persistLibrary(new Library(name, Status.PRIVATE, account));
	}

	public Library getLibrary(int id) {
		Session s = sessionFactory.getCurrentSession();
		Library library = (Library) s.createCriteria(Library.class).add(Restrictions.eq("id", id)).uniqueResult();
		if (library == null)
			throw new LibraryNotFoundException("404: Library not found");
		return library;
	}

	public List<Library> getLibrariesByAccount(int accountId) {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Library> libraries = (List<Library>) s.createCriteria(Library.class)
				.add(Restrictions.eq("account.id", accountId)).list();
		return new ArrayList<Library>(new HashSet<Library>(libraries));
	}

	public List<Library> getLibrariesByStatus(Status status) {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Library> libraries = (List<Library>) s.createCriteria(Library.class).add(Restrictions.eq("status", status))
				.list();
		return new ArrayList<Library>(new HashSet<Library>(libraries));
	}

	public boolean deleteLibrary(int id) {
		Session s = sessionFactory.getCurrentSession();
		Library library = getLibrary(id);
		if (library == null)
			throw new LibraryNotFoundException("404: Library to be deleted not found");
		List<Question> questions = questionRepository.getQuestionsByLibrary(library);
		for (Question question : questions) {
			question.setLibrary(null);
		}
		s.delete(library);
		return true;
	}

	public Library updateLibrary(int id, Status status) {
		Library library = getLibrary(id);
		if (library == null)
			throw new LibraryNotFoundException("404: Library to be updated not found");
		library.setStatus(status);
		return library;
	}

}
