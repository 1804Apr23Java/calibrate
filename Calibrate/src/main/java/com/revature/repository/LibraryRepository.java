package com.revature.repository;

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
import com.revature.beans.Status;

@Repository
@Transactional
@EnableTransactionManagement
public class LibraryRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Library getLibrary(int id) {
		Session s = sessionFactory.getCurrentSession();
		Library library = (Library) s.createCriteria(Library.class).add(Restrictions.eq("id", id)).uniqueResult();
		return library;
	}
	
	public List<Library> getPublicLibraries() {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Library> libraries = (List<Library>) s.createCriteria(Library.class).add(Restrictions.eq("status", Status.PUBLIC)).list();
		return libraries;
	}
	
	public List<Library> getLibrariesByAccount(Account account) {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Library> libraries = (List<Library>) s.createCriteria(Library.class).add(Restrictions.eq("account", account)).list();
		return libraries;
	}
}
