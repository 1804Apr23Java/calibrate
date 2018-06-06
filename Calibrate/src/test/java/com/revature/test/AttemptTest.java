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
import com.revature.service.AccountService;
import com.revature.service.AttemptService;
import com.revature.service.QuizService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })

public class AttemptTest {

	@Autowired
	private AttemptService as;

	@Autowired
	private AccountService acs;

	@Autowired
	private QuizService qs;

	@Test
	public void testAddAttempt() {
		Account account = acs.addAccount(new Account("user1", "pass1", "email1", false));
		Quiz quiz = qs.addQuiz(new Quiz("quiz1", new HashSet<Question>()));
		Attempt attempt = as.addAttempt(new Attempt(account, quiz, new HashSet<Answer>()));
		assertNotNull(attempt);
	}

	@Test
	public void testGetRealAttempt() {
		Account account = acs.addAccount(new Account("user2", "pass2", "email2", false));
		Quiz quiz = qs.addQuiz(new Quiz("quiz2", new HashSet<Question>()));
		Attempt attempt = as.addAttempt(new Attempt(account, quiz, new HashSet<Answer>()));
		Attempt attemptById = as.getAttempt(attempt.getId());
		assertNotNull(attemptById);
	}

	@Test
	public void testGetFakeAttempt() {
		assertNull(as.getAttempt(-1));
	}
}
