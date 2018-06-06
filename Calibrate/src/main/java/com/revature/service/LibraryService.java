package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Library;
import com.revature.beans.Status;
import com.revature.repository.LibraryRepository;

@Service
public class LibraryService {

	@Autowired
	private LibraryRepository libraryRepository;
	
	@Autowired
	private AccountService accountService;
	
	public Library addLibrary(Library library) {
		return libraryRepository.persistLibrary(library);
	}
	
	public Library getLibrary(int id) {
		return libraryRepository.getLibrary(id);
	}

	public List<Library> getLibrariesByStatus(Status status) {
		return libraryRepository.getLibrariesByStatus(status);
	}
	
	public List<Library> getLibrariesByAccount(int accountId) {
		return libraryRepository.getLibrariesByAccount(accountService.getAccount(accountId));
	}
	
}
