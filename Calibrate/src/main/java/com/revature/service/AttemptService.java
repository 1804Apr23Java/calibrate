package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Attempt;
import com.revature.repository.AttemptRepository;

@Service(value="attemptService")
public class AttemptService {

	@Autowired
	AttemptRepository ar;
	
public void addAttempt(Attempt attempt) {
		
		ar.persistAttempt(attempt);
		
	}
}
