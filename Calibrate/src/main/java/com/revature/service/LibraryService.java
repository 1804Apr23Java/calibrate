package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Library;
import com.revature.repository.LibraryRepository;

@Service
public class LibraryService {

	@Autowired
	private LibraryRepository libraryRepository;
	
	public Library getLibrary(int id) {
		return libraryRepository.getLibrary(id);
	}
	
}
