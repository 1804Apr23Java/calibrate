package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.json.AnswerJSON;
import com.revature.service.AnswerService;
import com.revature.util.BeanToJSONUtil;

@RestController
@RequestMapping("/answer")
public class AnswerController {

	@Autowired
	private AnswerService answerService;
	
	@Autowired
	private BeanToJSONUtil btju;
	
	@GetMapping("/{id}")
	public ResponseEntity<AnswerJSON> getAnswer(@PathVariable int id) {
		return new ResponseEntity<AnswerJSON>(btju.answerToJSON(answerService.getAnswer(id)), HttpStatus.OK);
	}
	
}
