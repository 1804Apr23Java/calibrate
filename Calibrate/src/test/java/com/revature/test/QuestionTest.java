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
import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.beans.Status;
import com.revature.repository.AccountRepository;
import com.revature.repository.LibraryRepository;
import com.revature.repository.QuestionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })

public class QuestionTest {

	@Autowired
	QuestionRepository qr;
	
	@Autowired
	AccountRepository ar;
	
	@Autowired
	LibraryRepository lr;
	
	@Test
	public void testAddQuestion() {
		Account account = new Account("join", "join", "join", false);
		ar.persistAccount(account);
		Library library = new Library("join", Status.PRIVATE, account);
		lr.persistLibrary(library);
		Question question = new Question("join", 1, library);
		Question realQuestion = qr.persistQuestion(question);
		assertNotNull(realQuestion);
	}
	
	@Test
	public void testGetRealQuestion() {
		Question realQuestion = qr.getQuestion(1);
		assertNotNull(realQuestion);
	}
	
	@Test
	public void testGetFakeQuestion() {
		Question fakeQuestion = qr.getQuestion(99);
		assertNull(fakeQuestion);
	}
	
	@Test
	public void testGetRealQuestionsByLibrary() {
		Account account = new Account("join99", "join99", "join99", false);
		ar.persistAccount(account);
		
		Library library1 = new Library("join99", Status.PRIVATE, account);
		lr.persistLibrary(library1);
		
		Question question = new Question("join99", 1, library1);
		Question realQuestion1 = qr.persistQuestion(question);		
		
		Library library = lr.getLibrary(library1.getId());
		List<Question> realQuestion = qr.getQuestionsByLibrary(library);
		assertNotNull(realQuestion);
	}
	
	@Test
	public void testGetFakeQuestionsByLibrary() {
		Account account = new Account("joiner", "joiner", "joiner", false);
		ar.persistAccount(account);
		Library library = new Library("joiner", Status.PRIVATE, account);
		lr.persistLibrary(library);
		List<Question> fakeQuestions = qr.getQuestionsByLibrary(library);
		assertNull(fakeQuestions);
	}
}
