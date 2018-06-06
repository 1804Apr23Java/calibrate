package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Attempt;
import com.revature.repository.AttemptRepository;

@Service
public class AttemptService {

	@Autowired
	private AttemptRepository attemptRepository;
	
	public Attempt getAttempt(int id) {
		return attemptRepository.getAttempt(id);
	}

	public Attempt addAttempt(Attempt attempt) {
		return attemptRepository.persistAttempt(attempt);
	}
	
	public List<Attempt> getAttemptByAccount(int accountId) {
		return attemptRepository.getAttemptByAccount(accountId);
	}
}
