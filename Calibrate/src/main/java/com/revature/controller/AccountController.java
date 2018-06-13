package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dto.AccountDTO;
import com.revature.service.AccountService;

@CrossOrigin
@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/{id}")
	public ResponseEntity<AccountDTO> getAccount(@PathVariable int id) {
		return new ResponseEntity<AccountDTO>(new AccountDTO(accountService.getAccount(id)), HttpStatus.OK);
	}

	//change this mapping to a postmapping
	@GetMapping("/email/{email}/password/{password}")
	public ResponseEntity<AccountDTO> login(@PathVariable String email, @PathVariable String password) {
		return new ResponseEntity<AccountDTO>(new AccountDTO(accountService.login(email, password)), HttpStatus.OK);
	}
	
}