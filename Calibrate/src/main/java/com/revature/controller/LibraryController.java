package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Library;
import com.revature.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	private LibraryService libraryService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Library> getLibrary(@PathVariable int id) {
		return new ResponseEntity<Library>(libraryService.getLibrary(id), HttpStatus.OK);
	}
	
	@GetMapping("/public")
	public ResponseEntity<List<Library>> getPublicLibraries() {
		return new ResponseEntity <List<Library>>(libraryService.getPublicLibraries(), HttpStatus.OK);
	}
	
	@GetMapping("/byUser/{accountId}")
	public ResponseEntity<List<Library>> getPublicLibraries(@PathVariable int accountId) {
		return new ResponseEntity <List<Library>>(libraryService.getLibrariesByAccount(accountId), HttpStatus.OK);
	}
	
}
