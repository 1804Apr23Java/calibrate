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
		Account account = as.addAccount(new Account("user4001", "pass4001", "email4001", false));
		Library library = ls.addLibrary(new Library("library4001", Status.PRIVATE, account));
		Question question = qs.addQuestion(new Question("question4001", 1, library));
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
		Account account = as.addAccount(new Account("user4002", "pass4002", "email4002", false));
		Library library = ls.addLibrary(new Library("library4002", Status.PRIVATE, account));
		qs.addQuestion(new Question("question4002", 1, library));
		List<Question> questions = qs.getQuestionsByLibrary(library.getId());
		assertEquals(1, questions.size());
	}

	@Test
	public void testGetFakeQuestionsByLibrary() {
		Account account = as.addAccount(new Account("user4003", "pass4003", "email4003", false));
		Library library = ls.addLibrary(new Library("library4003", Status.PRIVATE, account));
		List<Question> fakeQuestions = qs.getQuestionsByLibrary(library.getId());
		assertEquals(0, fakeQuestions.size());
	}
}
