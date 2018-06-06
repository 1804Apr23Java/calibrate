package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Account;
import com.revature.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public Account getAccount(int id) {
		return accountRepository.getAccount(id);
	}

	public Account addAccount(Account account) {
		return accountRepository.persistAccount(account);
	}

	public Account updateUsername(int id, String username) {
		return accountRepository.updateUsername(id, username);
	}

	public Account login(String email, String password) {
		Account account = accountRepository.login(email, password);
		if (account != null) {
			account.setPassword("");
		}
		return account;
	}

}
