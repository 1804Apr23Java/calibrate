package com.revature.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Answer;
import com.revature.beans.Question;
import com.revature.dto.AnswerDTO;
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
		List<Question> questions = questionRepository.getQuestionsByLibrary(libraryRepository.getLibrary(libraryId));
		return questions;
	}

	public Question addQuestionToLibrary(String value, int difficulty, int libraryId, List<AnswerDTO> answerDTOs) {
		Set<Answer> answers = answerDTOs.stream()
				.map(answer -> new Answer(answer.getValue(), answer.getIsCorrect(), null))
				.collect(Collectors.toSet());
		return questionRepository.addQuestion(value, difficulty, libraryId, answers);
	}
}
