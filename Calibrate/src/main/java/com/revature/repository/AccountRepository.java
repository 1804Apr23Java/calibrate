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
import com.revature.exception.AccountNotFoundException;
import com.revature.exception.InvalidLoginException;

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
		if (account == null)
			throw new AccountNotFoundException("404: Account with given id not found.");
		return account;
	}
	
	public List<Account> getAllAccounts() {
		Session s = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Account> accounts = (List<Account>) s.createQuery("from Account").list();
		return accounts;
	}
	
	public Account updateEmail(int id, String email) {
		Account account = getAccount(id);
		if (account == null)
			throw new AccountNotFoundException("404: Account to be updated not found.");
		account.setEmail(email);
		return account;
	}

	public Account login(String email, String password) {
		Session s = sessionFactory.getCurrentSession();
		Account account = (Account) s.createCriteria(Account.class).add(Restrictions.eq("email", email)).uniqueResult();
		if (account == null || !account.getPassword().equals(password))
			throw new InvalidLoginException("404: Credentials invalid.");
		return account;
	}

}
