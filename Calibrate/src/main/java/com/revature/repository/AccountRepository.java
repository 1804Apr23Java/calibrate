package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Account;

@Repository
@Transactional
public class AccountRepository {

	@Autowired
	SessionFactory sessionFactory;

	public List<Account> getAccounts() {
		List<Account> accounts = new ArrayList<Account>();
		Session s = sessionFactory.getCurrentSession();
		accounts = s.createQuery("from Account").list();
		return accounts;
	}

	public Account persistAccount(Account f) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(f);
		return f;
	}

}
