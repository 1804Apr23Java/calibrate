package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Quiz;
import com.revature.repository.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	private QuizRepository quizRepository;
	
	public Quiz getQuiz(int id) {
		return quizRepository.getQuiz(id);
	}
	

}
