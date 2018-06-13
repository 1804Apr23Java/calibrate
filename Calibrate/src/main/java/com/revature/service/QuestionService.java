package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Question;
import com.revature.repository.LibraryRepository;
import com.revature.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	public Question getQuestion(int id) {
		return questionRepository.getQuestion(id);
	}
	
	public List<Question> getQuestionsByLibrary(int libraryId) {
		List<Question>questions = questionRepository.getQuestionsByLibrary(libraryRepository.getLibrary(libraryId));
		return questions;
	}
	
	public Question addQuestionToLibrary(String value, int difficulty, int libraryId) {
		return questionRepository.addQuestion(value, difficulty, libraryId);
	}
}
