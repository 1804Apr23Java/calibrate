package com.revature.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Library;

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
}
