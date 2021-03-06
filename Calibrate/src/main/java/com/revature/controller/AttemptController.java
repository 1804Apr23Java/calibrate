package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.json.AttemptJSON;
import com.revature.service.AttemptService;
import com.revature.util.BeanToJSONUtil;

@CrossOrigin
@RestController
@RequestMapping("/attempt")
public class AttemptController {

	@Autowired
	private AttemptService attemptService;

	@Autowired
	private BeanToJSONUtil btju;

	@GetMapping("/{id}")
	public ResponseEntity<AttemptJSON> getAttempt(@PathVariable int id) {
		return new ResponseEntity<AttemptJSON>(btju.attemptToJSON(attemptService.getAttempt(id)), HttpStatus.OK);
	}

	@GetMapping("/byAccount/{accountId}")
	public ResponseEntity<List<AttemptJSON>> getAttemptsById(@PathVariable int accountId) {
		return new ResponseEntity<List<AttemptJSON>>(
				btju.attemptsToJSON(attemptService.getAttemptsByAccount(accountId)), HttpStatus.OK);
	}

	@GetMapping("/submit/byAccount/{accountId}/forQuiz/{quizId}/withAnswers/{answerIds}")
	public ResponseEntity<AttemptJSON> submitAttempt(@PathVariable int accountId, @PathVariable int quizId,
			@PathVariable List<Integer> answerIds) {
		return new ResponseEntity<AttemptJSON>(btju.attemptToJSON(attemptService.addAttempt(accountId, quizId, answerIds)), HttpStatus.OK);
	}

}
