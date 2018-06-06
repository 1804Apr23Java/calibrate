package com.revature.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.beans.Account;
import com.revature.beans.Answer;
import com.revature.beans.Attempt;
import com.revature.beans.Question;
import com.revature.beans.Quiz;
import com.revature.repository.AccountRepository;
import com.revature.repository.AttemptRepository;
import com.revature.repository.QuizRepository;
import com.revature.service.AttemptService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })

public class AttemptTest {

	@Autowired
	AttemptRepository ar;

	@Autowired
	AttemptService as;

	@Autowired
	private AccountRepository acr;

	@Autowired
	private QuizRepository qr;

	@Test
	public void testAddAttempt() {
		Account account = new Account("name23", "name23", "name49", false);
		acr.persistAccount(account);
		Quiz quiz = new Quiz("name99", new HashSet<Question>());
		qr.persistQuiz(quiz);
		Set<Answer> answers = new HashSet<Answer>();
		Attempt attempt = new Attempt(account, quiz, answers);
		Attempt realAttempt = ar.persistAttempt(attempt);
		assertNotNull(realAttempt);
	}

	@Test
	public void testGetRealAttempt() {
		Attempt realAttempt = ar.getAttempt(1);
		assertNotNull(realAttempt);
	}

	@Test
	public void testGetFakeAttempt() {
		Attempt fakeAttempt = ar.getAttempt(99);
		assertNull(fakeAttempt);
	}
}
