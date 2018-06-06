package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Answer;
import com.revature.beans.Question;
import com.revature.repository.AnswerRepository;
import com.revature.repository.QuestionRepository;

@Service
public class AnswerService {
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public Answer getAnswer(int id) {
		return answerRepository.getAnswer(id);
	}
	public List<Answer> getAnswersByQuestion(int id) {
		Question question = questionRepository.getQuestion(id);
		if(question == null)
			return null;
		return answerRepository.getAnswersByQuestion(question);
	}

}
