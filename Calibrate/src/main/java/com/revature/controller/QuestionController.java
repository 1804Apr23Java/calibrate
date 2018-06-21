package com.revature.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Question;
import com.revature.dto.QuestionDTO;
import com.revature.service.QuestionService;

@CrossOrigin
@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@GetMapping("/{id}")
	public ResponseEntity<QuestionDTO> getQuestion(@PathVariable int id) {
		return new ResponseEntity<QuestionDTO>(new QuestionDTO(questionService.getQuestion(id)), HttpStatus.OK);
	}

	@GetMapping("/byLibrary/{libraryId}")
	public ResponseEntity<List<QuestionDTO>> getQuestionsByLibrary(@PathVariable int libraryId) {
		List<Question> questions = questionService.getQuestionsByLibrary(libraryId);
		return new ResponseEntity<List<QuestionDTO>>(
				questions.stream().map(QuestionDTO::new).collect(Collectors.toList()), HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<QuestionDTO> addQuestion(@RequestBody QuestionDTO question) {
		return new ResponseEntity<QuestionDTO>(new QuestionDTO(questionService.addQuestionToLibrary(question.getValue(),
				question.getDifficulty(), question.getLibraryId(), question.getAnswers())),
				HttpStatus.OK);
	}
}