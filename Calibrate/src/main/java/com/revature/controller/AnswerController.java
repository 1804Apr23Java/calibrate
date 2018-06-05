package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Answer;
import com.revature.service.AnswerService;

@RestController
@RequestMapping("/answer")
public class AnswerController {

	@Autowired
	private AnswerService answerService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Answer> getAnswer(@PathVariable int id) {
		return new ResponseEntity<Answer>(answerService.getAnswer(id), HttpStatus.OK);
	}
	
}
