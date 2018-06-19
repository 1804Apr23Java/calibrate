package com.revature.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Attempt;
import com.revature.dto.AttemptDTO;
import com.revature.service.AttemptService;

@CrossOrigin
@RestController
@RequestMapping("/attempt")
public class AttemptController {

	@Autowired
	private AttemptService attemptService;

	@GetMapping("/{id}")
	public ResponseEntity<AttemptDTO> getAttempt(@PathVariable int id) {
		return new ResponseEntity<AttemptDTO>(new AttemptDTO(attemptService.getAttempt(id)), HttpStatus.OK);
	}

	@GetMapping("/byAccount/{accountId}")
	public ResponseEntity<List<AttemptDTO>> getAttemptsById(@PathVariable int accountId) {
		List<Attempt> attempts = attemptService.getAttemptsByAccount(accountId);
		return new ResponseEntity<List<AttemptDTO>>(attempts.stream().map(AttemptDTO::new).collect(Collectors.toList()),
				HttpStatus.OK);
	}

	@GetMapping("/submit/byAccount/{accountId}/forQuiz/{quizId}/withAnswers/{answerIds}")
	public ResponseEntity<AttemptDTO> submitAttempt(@PathVariable int accountId, @PathVariable int quizId,
			@PathVariable List<Integer> answerIds) {
		return new ResponseEntity<AttemptDTO>(new AttemptDTO(attemptService.addAttempt(accountId, quizId, answerIds)),
				HttpStatus.OK);
	}

}
