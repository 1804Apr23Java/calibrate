package com.revature.test;

import static org.junit.Assert.assertEquals;
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
import com.revature.service.AccountService;
import com.revature.service.AnswerService;
import com.revature.service.LibraryService;
import com.revature.service.QuestionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })
public class AnswerTest {

	@Autowired
	private AnswerService as;
	
	@Autowired
	private AccountService acs;
	
	@Autowired
	private LibraryService ls;
	
	@Autowired
	private QuestionService qs;
	
	@Test
	public void testAddAnswer() {
		Account account = acs.addAccount(new Account("user1","pass1","email1", false));
		Library library = ls.addLibrary(new Library("library1", Status.PRIVATE, account));
		Question question = qs.addQuestion(new Question("question1", 1, library));
		Answer answer = as.addAnswer(new Answer("answer1", true, question));
		assertNotNull(answer);
	}
	
	@Test
	public void testGetRealAnswerById() {
		Account account = acs.addAccount(new Account("user2","pass2","email2", false));
		Library library = ls.addLibrary(new Library("library2", Status.PRIVATE, account));
		Question question = qs.addQuestion(new Question("question2", 1, library));
		Answer answer = as.addAnswer(new Answer("answer2", true, question));
		Answer answerById = as.getAnswer(answer.getId());
		assertNotNull(answerById);
	}
	
	@Test
	public void testGetFakeAnswerById() {
		assertNull(as.getAnswer(-1));
	}
	
	@Test
	public void testGetRealAnswersByQuestion() {

		Account account = acs.addAccount(new Account("user3","pass3","email3", false));
		Library library = ls.addLibrary(new Library("library3", Status.PRIVATE, account));
		Question question = qs.addQuestion(new Question("question3", 1, library));
		as.addAnswer(new Answer("answer3", true, question));
		List<Answer> answers = as.getAnswersByQuestion(question.getId());
		assertNotNull(answers);
		assertEquals(answers.size(), 1);
	}
	
	@Test
	public void testGetFakeAnswersByQuestion() {
		List<Answer> fakeAnswer = as.getAnswersByQuestion(-1);
		assertNull(fakeAnswer);
	}
}
