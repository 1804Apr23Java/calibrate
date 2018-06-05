package com.revature.repository;

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
		Account account = this.getAccount(id);
		account.setUsername(username);
		return account;
	}

	public Account login(String email, String password) {
		Session s = sessionFactory.getCurrentSession();
		Account account = (Account) s.createCriteria(Account.class).add(Restrictions.eq("email", email)).uniqueResult();
		if (account.getPassword().equals(password)) {
			return account;
		}
		else
			return null;
	}

}
