package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Question;
import com.revature.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private LibraryService libraryService;
	
	public Question getQuestion(int id) {
		return questionRepository.getQuestion(id);
	}
	
	public List<Question> getQuestionByLibrary(int libraryId) {
		List<Question>questions = questionRepository.getQuestionsByLibrary(libraryService.getLibrary(libraryId));
		return questions;
	}

}
