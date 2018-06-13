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

import com.revature.beans.Answer;
import com.revature.dto.AnswerDTO;
import com.revature.service.AnswerService;
import com.revature.util.BeanToJSONUtil;

@CrossOrigin
@RestController
@RequestMapping("/answer")
public class AnswerController {

	@Autowired
	private AnswerService answerService;

	@GetMapping("/{id}")
	public ResponseEntity<AnswerDTO> getAnswer(@PathVariable int id) {
		return new ResponseEntity<AnswerDTO>(new AnswerDTO(answerService.getAnswer(id)), HttpStatus.OK);
	}

	@GetMapping("/byQuestion/{id}")
	public ResponseEntity<List<AnswerDTO>> getAnswersByQuestion(@PathVariable int id) {
		List<AnswerDTO> answers = answerService.getAnswersByQuestion(id).stream().map(AnswerDTO::new)
				.collect(Collectors.toList());
		return new ResponseEntity<List<AnswerDTO>>(answers, HttpStatus.OK);
	}
}
