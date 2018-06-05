package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Attempt;
import com.revature.service.AttemptService;
import com.revature.util.BeanToJSONUtil;

@RestController
@RequestMapping("/attempt")
public class AttemptController {

	@Autowired
	private AttemptService attemptService;
	
	@Autowired
	private BeanToJSONUtil btju;

	@GetMapping("/{id}")
	public ResponseEntity<Attempt> getAttempt(@PathVariable int id) {
		return new ResponseEntity<Attempt>(attemptService.getAttempt(id), HttpStatus.OK);
	}
	
}
