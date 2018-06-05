package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Question;
import com.revature.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public Question getQuestion(int id) {
		return questionRepository.getQuestion(id);
	}

}
