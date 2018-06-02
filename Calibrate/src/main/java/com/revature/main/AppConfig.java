package com.revature.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.repository.AccountRepository;
import com.revature.service.AccountService;

@Configuration
public class AppConfig {

	@Bean
	public AccountService accountService() {
		return new AccountService();
	}
	
	@Bean
	public AccountRepository accountRepository() {
		return new AccountRepository();
	}
}
