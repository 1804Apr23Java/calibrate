package com.revature.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

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
		Account account = new Account("name","name","name", false);
		acr.persistAccount(account);
		Library library = new Library("name", Status.PRIVATE, account);
		lr.persistLibrary(library);
		Question question = new Question("name", 1, library);
		qr.persistQuestion(question);
		Answer answer = new Answer("name", true, question);
		Answer realAnswer = ar.persistAnswer(answer);
		assertNotNull(realAnswer);
	}
	
	@Test
	public void testGetRealAnswerById() {
		Account account = new Account("name2","name2","name2", false);
		acr.persistAccount(account);
		Library library = new Library("name2", Status.PRIVATE, account);
		lr.persistLibrary(library);
		Question question = new Question("name2", 1, library);
		qr.persistQuestion(question);
		Answer answer = new Answer("name2", true, question);
		Answer realAnswer1 = ar.persistAnswer(answer);
		Answer realAnswer = ar.getAnswer(realAnswer1.getId());
		assertNotNull(realAnswer);
	}
	
	@Test
	public void testGetFakeAnswerById() {
		Answer fakeAnswer = ar.getAnswer(3);
		assertNull(fakeAnswer);
	}
	
	@Test
	public void testGetRealAnswersByQuestion() {
		List<Answer> realAnswer = ar.getAnswersByQuestion(qr.getQuestion(1));
		assertNotNull(realAnswer);
	}
	
	@Test
	public void testGetFakeAnswersByQuestion() {
		List<Answer> fakeAnswer = ar.getAnswersByQuestion(qr.getQuestion(8));
		assertNull(fakeAnswer);
	}
}
