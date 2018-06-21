package com.revature.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Account;
import com.revature.dto.AccountDTO;
import com.revature.service.AccountService;
import com.revature.util.LoginData;

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
	
	@GetMapping("/all")
	public ResponseEntity<List<AccountDTO>> getAllAccounts() {
		return new ResponseEntity<List<AccountDTO>>(
				accountService.getAllAccounts().stream().map(AccountDTO::new).collect(Collectors.toList()), HttpStatus.OK);
	}

	// change this mapping to a postmapping
	@GetMapping("/email/{email}/password/{password}")
	public ResponseEntity<AccountDTO> login(@PathVariable String email, @PathVariable String password) {
		return new ResponseEntity<AccountDTO>(new AccountDTO(accountService.login(email, password)), HttpStatus.OK);
	}

	@PostMapping("/loginForm")
	public ResponseEntity<AccountDTO> loginPost(@RequestParam String email, @RequestParam String password) {
		return new ResponseEntity<AccountDTO>(new AccountDTO(accountService.login(email, password)), HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<AccountDTO> loginPost(@RequestBody LoginData loginData) {
		return new ResponseEntity<AccountDTO>(
				new AccountDTO(accountService.login(loginData.getEmail(), loginData.getPassword())), HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<AccountDTO> add(@RequestBody AccountDTO account) {
		return new ResponseEntity<AccountDTO>(
				new AccountDTO(accountService.addAccount(
						new Account(account.getEmail(), account.getPassword(), account.getFirstName(), account.getLastName()))),
				HttpStatus.OK);
	}

	@PostMapping("/updateEmail")
	public ResponseEntity<AccountDTO> updateEmail(@RequestParam int accountId, @RequestParam String newEmail) {
		return null;
	}
}