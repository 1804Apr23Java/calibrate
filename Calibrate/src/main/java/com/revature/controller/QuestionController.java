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

import com.revature.beans.Question;
import com.revature.json.QuestionJSON;
import com.revature.service.QuestionService;
import com.revature.util.BeanToJSONUtil;

@CrossOrigin
@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private BeanToJSONUtil btju;
	
	@GetMapping("/{id}")
	public ResponseEntity<QuestionJSON> getQuestion(@PathVariable int id) {
		return new ResponseEntity<QuestionJSON>(btju.questionToJSON(questionService.getQuestion(id)), HttpStatus.OK);
	}
	
	@GetMapping("/byLibrary/{libraryId}")
	public ResponseEntity<List<Question>> getQuestionsByLibrary(@PathVariable int libraryId) {
		return new ResponseEntity<List<Question>>(questionService.getQuestionsByLibrary(libraryId), HttpStatus.OK);
	}
	
	//partially done; repository and service are done
//	@GetMapping("/questionId/{questionId}/LibraryId/{libraryId}")
//	public ResponseEntity<QuestionJSON> addQuestion(@PathVariable int questionId, @PathVariable int libraryId) {
//		Library library = libraryService.getLibrary(libraryId);
//		if(library == null){
//			return null;
//		}
//		Question question = new Question()
//		if(account == null) {
//			return null;
//		}
//		Library library = new Library(libraryName, Status.PRIVATE, account);
//		return new ResponseEntity <LibraryJSON>(btju.libraryToJSON(libraryService.addLibrary(library)), HttpStatus.OK);
//	}
	
	
}