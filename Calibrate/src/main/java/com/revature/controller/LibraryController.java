package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Account;
import com.revature.beans.Library;
import com.revature.beans.Status;
import com.revature.json.LibraryJSON;
import com.revature.service.AccountService;
import com.revature.service.LibraryService;
import com.revature.util.BeanToJSONUtil;

@CrossOrigin
@RestController
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	private LibraryService libraryService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private BeanToJSONUtil btju;
	
	@GetMapping("/{id}")
	public ResponseEntity<LibraryJSON> getLibrary(@PathVariable int id) {
		return new ResponseEntity<LibraryJSON>(btju.libraryToJSON(libraryService.getLibrary(id)), HttpStatus.OK);
	}
	
	@GetMapping("/public")
	public ResponseEntity<List<LibraryJSON>> getPublicLibraries() {
		return new ResponseEntity <List<LibraryJSON>>(btju.librariesToJSON(libraryService.getPublicLibraries()), HttpStatus.OK);
	}
	
	@GetMapping("/byUser/{accountId}")
	public ResponseEntity<List<LibraryJSON>> getPublicLibraries(@PathVariable int accountId) {
		return new ResponseEntity <List<LibraryJSON>>(btju.librariesToJSON(libraryService.getLibrariesByAccount(accountId)), HttpStatus.OK);
	}
	
	@GetMapping("/new/{libraryName}/accountId/{accountId}")
	public ResponseEntity<LibraryJSON> addLibrary(@PathVariable String libraryName, @PathVariable int accountId) {
		Account account = accountService.getAccount(accountId);
		if(account == null) {
			return null;
		}
		Library library = new Library(libraryName, Status.PRIVATE, account);
		return new ResponseEntity <LibraryJSON>(btju.libraryToJSON(libraryService.addLibrary(library)), HttpStatus.OK);
	}
	
	
}
