package com.revature.service;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Question;
import com.revature.beans.Quiz;
import com.revature.repository.QuestionRepository;
import com.revature.repository.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	private QuizRepository quizRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public Quiz getQuiz(int id) {
		return quizRepository.getQuiz(id);
	}
	
	public Quiz addQuiz(Quiz quiz) {
		return quizRepository.persistQuiz(quiz);
	}
	
	public Quiz generateQuiz(String name, List<Integer> libraryIds, int length) {
		
		List<Question> candidateQuestions = questionRepository.getQuestionsByLibraries(libraryIds);
		if (candidateQuestions.size() < length)
			return null;
		Collections.shuffle(candidateQuestions);
		return quizRepository.persistQuiz(new Quiz(name, new HashSet<Question>(candidateQuestions.subList(0, length))));
	}
	

}
