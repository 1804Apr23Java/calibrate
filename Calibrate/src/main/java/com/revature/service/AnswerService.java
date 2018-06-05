package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Answer;
import com.revature.repository.AnswerRepository;

@Service
public class AnswerService {
	
	@Autowired
	private AnswerRepository answerRepository;
	
	public Answer getAnswer(int id) {
		return answerRepository.getAnswer(id);
	}

}
