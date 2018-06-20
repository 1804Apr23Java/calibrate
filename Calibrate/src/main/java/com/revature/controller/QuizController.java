package com.revature.controller;

import java.util.List;

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

import com.revature.dto.QuizDTO;
import com.revature.service.QuizService;
import com.revature.util.QuizParameters;

@CrossOrigin
@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizService quizService;

	@GetMapping("/{id}")
	public ResponseEntity<QuizDTO> getQuiz(@PathVariable int id) {
		return new ResponseEntity<QuizDTO>(new QuizDTO(quizService.getQuiz(id)), HttpStatus.OK);
	}

	@GetMapping("/generate/{name}/byRandom/withLibraries/{libraryIds}/numQuestions/{length}")
	public ResponseEntity<QuizDTO> generateQuiz(@PathVariable String name, @PathVariable List<Integer> libraryIds,
			@PathVariable int length) {
		return new ResponseEntity<QuizDTO>(new QuizDTO(quizService.generateQuiz(name, libraryIds, length)),
				HttpStatus.OK);
	}

	@GetMapping("/generate/{name}/byHardest/withLibraries/{libraryIds}/numQuestions/{length}")
	public ResponseEntity<QuizDTO> generateQuizByHardest(@PathVariable String name,
			@PathVariable List<Integer> libraryIds, @PathVariable int length) {
		return new ResponseEntity<QuizDTO>(new QuizDTO(quizService.generateQuizByHardest(name, libraryIds, length)),
				HttpStatus.OK);
	}

	@PostMapping("/generate/byRandom")
	public ResponseEntity<QuizDTO> generateQuizByRandom(@RequestBody QuizParameters quizParameters) {
		return new ResponseEntity<QuizDTO>(new QuizDTO(quizService.generateQuizByHardest(quizParameters.getName(),
				quizParameters.getLibraryIds(), quizParameters.getNumQuestions())), HttpStatus.OK);
	}

}
