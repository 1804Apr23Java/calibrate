package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Account;
import com.revature.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account getAccount(int id) {
		Account account = accountRepository.getAccount(id);
		account.setPassword("");
		return account;
	}

	public Account addAccount(Account account) {
		account =  accountRepository.persistAccount(account);
		account.setPassword("");
		return account;
	}

	public List<Account> getAllAccounts() {
		return accountRepository.getAllAccounts();
	}
	
	public Account updateEmail(int id, String email) {
		Account account =  accountRepository.updateEmail(id, email);
		account.setPassword("");
		return account;
	}

	public Account login(String email, String password) {
		Account account = accountRepository.login(email, password);
		account.setPassword("");
		return account;
	}

}
