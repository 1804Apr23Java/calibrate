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

import com.revature.beans.Quiz;
import com.revature.json.QuizJSON;
import com.revature.service.QuizService;
import com.revature.util.BeanToJSONUtil;

@CrossOrigin
@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	@Autowired
	private BeanToJSONUtil btju;
	
	@GetMapping("/{id}")
	public ResponseEntity<QuizJSON> getQuiz(@PathVariable int id) {
		Quiz q = quizService.getQuiz(id);
		return new ResponseEntity<QuizJSON>(btju.quizToJSON(q), HttpStatus.OK);
	}
	
	@GetMapping("/generate/{name}/byRandom/withLibraries/{libraryIds}/numQuestions/{length}")
	public ResponseEntity<QuizJSON> generateQuiz(@PathVariable String name, @PathVariable List<Integer> libraryIds, @PathVariable int length) {
		return new ResponseEntity<QuizJSON>(btju.quizToJSON(quizService.generateQuiz(name, libraryIds, length)), HttpStatus.OK);
	}

	@GetMapping("/generate/{name}/byHardest/withLibraries/{libraryIds}/numQuestions/{length}")
	public ResponseEntity<QuizJSON> generateQuizByHardest(@PathVariable String name, @PathVariable List<Integer> libraryIds, @PathVariable int length) {
		return new ResponseEntity<QuizJSON>(btju.quizToJSON(quizService.generateQuizByHardest(name, libraryIds, length)), HttpStatus.OK);
	}
	
}
