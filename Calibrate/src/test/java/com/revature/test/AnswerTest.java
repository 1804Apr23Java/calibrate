package com.revature.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.beans.Account;
import com.revature.beans.Answer;
import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.beans.Status;
import com.revature.repository.AccountRepository;
import com.revature.repository.AnswerRepository;
import com.revature.repository.LibraryRepository;
import com.revature.repository.QuestionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })
public class AnswerTest {

	@Autowired
	AnswerRepository ar;
	
	@Autowired
	AccountRepository acr;
	
	@Autowired
	LibraryRepository lr;
	
	@Autowired
	QuestionRepository qr;
	
	@Test
	public void testAddAnswer() {
		Account account = new Account("","","", false);
		acr.persistAccount(account);
		Library library = new Library("", Status.PRIVATE, account);
		lr.persistLibrary(library);
		Question question = new Question("", 1, library);
		qr.persistQuestion(question);
		Answer answer = new Answer("", true, question);
		Answer realAnswer = ar.persistAnswer(answer);
		assertNotNull(realAnswer);
	}
	
}
