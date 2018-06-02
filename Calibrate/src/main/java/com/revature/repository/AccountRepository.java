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
@EnableTransactionManagement
public class AccountRepository {

	@Autowired
	SessionFactory sessionFactory;

	public List<Account> getAccounts() {
		Session s = sessionFactory.getCurrentSession();
		System.out.println(0);
		List<Account> accounts = s.createQuery("FROM Account").list();;
		System.out.println(1);
		System.out.println(accounts);
		System.out.println(2);
		return accounts;
	}

	public Account persistAccount(Account f) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(f);
		return f;
	}

}
