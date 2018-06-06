package com.revature.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.beans.Question;
import com.revature.beans.Quiz;
import com.revature.service.QuizService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class QuizTest {

	@Autowired
	QuizService qs;
	
	@Test
	public void testPersistQuiz() {
		Quiz quiz = qs.addQuiz(new Quiz("name1", new HashSet<Question>()));
		assertNotNull(quiz);
	}
	
	@Test
	public void testGetRealQuiz() {
		Quiz quiz = qs.addQuiz(new Quiz("name2", new HashSet<Question>()));
		assertNotNull(quiz.getId());
	}

	@Test
	public void testGetFakeQuiz() {
		assertNull(qs.getQuiz(-1));
	}
	
}
