package com.revature.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })

public class AttemptTest {

	/*
	@Autowired
	private AttemptService as;

	@Autowired
	private AccountService acs;

	@Autowired
	private QuizService qs;

	@Test
	public void testAddAttempt() {
		Account account = acs.addAccount(new Account("user3001", "pass3001", "email3001", false));
		Quiz quiz = qs.addQuiz(new Quiz("quiz3001", new HashSet<Question>()));
		Attempt attempt = as.addAttempt(new Attempt(account, quiz, new HashSet<Answer>()));
		assertNotNull(attempt);
	}

	@Test
	public void testGetRealAttempt() {
		Account account = acs.addAccount(new Account("user3002", "pass3002", "email3002", false));
		Quiz quiz = qs.addQuiz(new Quiz("quiz3002", new HashSet<Question>()));
		Attempt attempt = as.addAttempt(new Attempt(account, quiz, new HashSet<Answer>()));
		Attempt attemptById = as.getAttempt(attempt.getId());
		assertNotNull(attemptById);
	}

	@Test
	public void testGetFakeAttempt() {
		assertNull(as.getAttempt(-1));
	}
	*/
}
