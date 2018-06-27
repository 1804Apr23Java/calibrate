package com.revature.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Library;
import com.revature.beans.Status;
import com.revature.dto.LibraryDTO;
import com.revature.service.LibraryService;

@CrossOrigin
@RestController
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	private LibraryService libraryService;

	@GetMapping("/{id}")
	public ResponseEntity<LibraryDTO> getLibrary(@PathVariable int id) {
		return new ResponseEntity<LibraryDTO>(new LibraryDTO(libraryService.getLibrary(id)), HttpStatus.OK);
	}

	@GetMapping("/public")
	public ResponseEntity<List<LibraryDTO>> getPublicLibraries() {
		List<Library> libraries = libraryService.getLibrariesByStatus(Status.PUBLIC);
		return new ResponseEntity<List<LibraryDTO>>(
				libraries.stream().map(LibraryDTO::new).collect(Collectors.toList()), HttpStatus.OK);
	}

	@GetMapping("/pending")
	public ResponseEntity<List<LibraryDTO>> getPendingLibraries() {
		List<Library> libraries = libraryService.getLibrariesByStatus(Status.PENDING);
		return new ResponseEntity<List<LibraryDTO>>(
				libraries.stream().map(LibraryDTO::new).collect(Collectors.toList()), HttpStatus.OK);
	}

	@GetMapping("/byAccount/{accountId}")
	public ResponseEntity<List<LibraryDTO>> getPublicLibraries(@PathVariable int accountId) {
		List<Library> libraries = libraryService.getLibrariesByAccount(accountId);
		return new ResponseEntity<List<LibraryDTO>>(
				libraries.stream().map(LibraryDTO::new).collect(Collectors.toList()), HttpStatus.OK);
	}

	@GetMapping("/new/{libraryName}/accountId/{accountId}")
	public ResponseEntity<LibraryDTO> addLibrary(@PathVariable String libraryName, @PathVariable int accountId) {
		return new ResponseEntity<LibraryDTO>(new LibraryDTO(libraryService.addLibrary(libraryName, accountId)), HttpStatus.OK);
	}

	@GetMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteLibrary(@PathVariable int id) {
		return new ResponseEntity<Boolean>(libraryService.deleteLibrary(id), HttpStatus.OK);
	}

	@GetMapping("/id/{id}/status/{status}")
	public ResponseEntity<LibraryDTO> updateLibrary(@PathVariable int id, @PathVariable Status status) {
		return new ResponseEntity<LibraryDTO>(new LibraryDTO(libraryService.updateLibrary(id, status)), HttpStatus.OK);
	}
	
	@PatchMapping("/makePrivate")
	public ResponseEntity<LibraryDTO> makeLibraryPrivate(@RequestBody Integer libraryId) {
		return new ResponseEntity<LibraryDTO>(new LibraryDTO(libraryService.updateLibrary(libraryId, Status.PRIVATE)), HttpStatus.OK);
	}

	@PatchMapping("/makePublic")
	public ResponseEntity<LibraryDTO> makeLibraryPublic(@RequestBody Integer libraryId) {
		return new ResponseEntity<LibraryDTO>(new LibraryDTO(libraryService.updateLibrary(libraryId, Status.PUBLIC)), HttpStatus.OK);
	}
	
	@PatchMapping("/makePending")
	public ResponseEntity<LibraryDTO> makeLibraryPending(@RequestBody Integer libraryId) {
		return new ResponseEntity<LibraryDTO>(new LibraryDTO(libraryService.updateLibrary(libraryId, Status.PENDING)), HttpStatus.OK);
	}
}
