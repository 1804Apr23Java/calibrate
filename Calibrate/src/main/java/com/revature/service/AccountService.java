package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Account;
import com.revature.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository ar;
	
	public List<Account> getAccounts() {
		List<Account> accounts = ar.getAccounts();
		return accounts;
	}

}
