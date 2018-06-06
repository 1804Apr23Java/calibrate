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
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class QuizTest {

	@Autowired
	QuizRepository qr;
	
	@Test
	public void testPersistQuiz() {
		Quiz quiz = new Quiz("name1", new HashSet<Question>());
		Quiz realQuiz = qr.persistQuiz(quiz);
		assertNotNull(realQuiz);
	}
	
	@Test
	public void testGetRealQuiz() {
		Quiz realQuiz = qr.getQuiz(1);
		assertNotNull(realQuiz);
	}

	@Test
	public void testGetFakeQuiz() {
		Quiz fakeQuiz = qr.getQuiz(99);
		assertNull(fakeQuiz);
	}
	
}
