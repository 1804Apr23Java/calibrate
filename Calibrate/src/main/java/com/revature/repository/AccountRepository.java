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

@Repository
@Transactional
@EnableTransactionManagement
public class AccountRepository {

	@Autowired
	SessionFactory sessionFactory;

	public List<Account> getAccounts() {
		Session s = sessionFactory.getCurrentSession();
		List<Account> accounts = s.createQuery("FROM Account").list();
		return accounts;
	}

	public Account persistAccount(Account f) {
		Session s = sessionFactory.getCurrentSession();
		s.persist(f);
		return f;
	}
	
	public Account getAccount(int id) {
		Session s = sessionFactory.getCurrentSession();
		Account account = (Account) s.createCriteria(Account.class).add(Restrictions.eq("id", id)).uniqueResult();
		System.out.println("account");
		return account;
	}

}
