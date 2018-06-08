package com.revature.service;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Answer;
import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private LibraryService libraryService;
	
	public Question addQuestion(Question question) {
		return questionRepository.persistQuestion(question);
	}
	
	public Question getQuestion(int id) {
		return questionRepository.getQuestion(id);
	}
	
	public List<Question> getQuestionsByLibrary(int libraryId) {
		List<Question>questions = questionRepository.getQuestionsByLibrary(libraryService.getLibrary(libraryId));
		return questions;
	}
	
	public Question addQuestionToLibrary(String value, int difficulty, int libraryId) {
		value = value.replace("|", " ");
		value = value.replace("*", "?");
		Library library = libraryService.getLibrary(libraryId);
		if(library == null)
			return null;
		return questionRepository.persistQuestion(new Question(value, difficulty, library, new HashSet<Answer>()));
	}

}
