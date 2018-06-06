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
import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.beans.Status;
import com.revature.service.AccountService;
import com.revature.service.LibraryService;
import com.revature.service.QuestionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })

public class QuestionTest {

	@Autowired
	QuestionService qs;

	@Autowired
	AccountService as;

	@Autowired
	LibraryService ls;

	@Test
	public void testAddQuestion() {
		Account account = as.addAccount(new Account("user1", "pass1", "email1", false));
		Library library = ls.addLibrary(new Library("library1", Status.PRIVATE, account));
		Question question = qs.addQuestion(new Question("question1", 1, library));
		assertNotNull(question);
	}

	@Test
	public void testGetRealQuestion() {
		assertNotNull(qs.getQuestion(1));
	}

	@Test
	public void testGetFakeQuestion() {
		assertNull(qs.getQuestion(99));
	}

	@Test
	public void testGetRealQuestionsByLibrary() {
		Account account = as.addAccount(new Account("user2", "pass2", "email2", false));
		Library library = ls.addLibrary(new Library("library2", Status.PRIVATE, account));
		qs.addQuestion(new Question("question3", 1, library));
		List<Question> questions = qs.getQuestionsByLibrary(library.getId());
		assertEquals(1, questions.size());
	}

	@Test
	public void testGetFakeQuestionsByLibrary() {
		Account account = as.addAccount(new Account("user3", "pass3", "email3", false));
		Library library = ls.addLibrary(new Library("library3", Status.PRIVATE, account));
		List<Question> fakeQuestions = qs.getQuestionsByLibrary(library.getId());
		assertEquals(0, fakeQuestions.size());
	}
}
