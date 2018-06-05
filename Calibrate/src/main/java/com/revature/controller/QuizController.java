package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Quiz;
import com.revature.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Quiz> getQuiz(@PathVariable int id) {
		return new ResponseEntity<Quiz>(quizService.getQuiz(id), HttpStatus.OK);
	}
	
}
