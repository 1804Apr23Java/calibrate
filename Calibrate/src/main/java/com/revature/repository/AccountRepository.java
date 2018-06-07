package com.revature.repository;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Account;

@Repository
@Transactional
@EnableTransactionManagement
public class AccountRepository {
	
	final static Logger logger = Logger.getLogger(AccountRepository.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	public Account persistAccount(Account account) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(account);
		return account;
	}

	public Account getAccount(int id) {
		Session s = sessionFactory.getCurrentSession();
		Account account = (Account) s.createCriteria(Account.class).add(Restrictions.eq("id", id)).uniqueResult();
		return account;
	}

	
	public Account updateUsername(int id, String username) {
		Session s = sessionFactory.getCurrentSession();
		Account account = (Account) s.createCriteria(Account.class).add(Restrictions.eq("id", id)).uniqueResult();
		if (account == null)
			return null;
		account.setUsername(username);
		s.persist(account);
		return account;
	}


	public Account login(String email, String password) {
		Session s = sessionFactory.getCurrentSession();
		Account account = (Account) s.createCriteria(Account.class).add(Restrictions.eq("email", email)).uniqueResult();
		if (account == null || !account.getPassword().equals(password)) {
			System.out.println("hello");
			logger.warn("this is a warning log message");
			return null;
		}
		return account;
	}

}
