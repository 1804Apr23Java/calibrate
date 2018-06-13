package com.revature.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })
public class AnswerTest {

	/*
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
		Account account = acs.addAccount(new Account("user2001","pass2001","email2001", false));
		Library library = ls.addLibrary(new Library("library2001", Status.PRIVATE, account));
		Question question = qs.addQuestion(new Question("question2001", 1, library));
		Answer answer = as.addAnswer(new Answer("answer1", true, question));
		assertNotNull(answer);
	}
	
	@Test
	public void testGetRealAnswerById() {
		Account account = acs.addAccount(new Account("user2002","pass2002","email2002", false));
		Library library = ls.addLibrary(new Library("library2002", Status.PRIVATE, account));
		Question question = qs.addQuestion(new Question("question2002", 1, library));
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

		Account account = acs.addAccount(new Account("user2003","pass2003","email2003", false));
		Library library = ls.addLibrary(new Library("library2003", Status.PRIVATE, account));
		Question question = qs.addQuestion(new Question("question2003", 1, library));
		as.addAnswer(new Answer("answer2003", true, question));
		List<Answer> answers = as.getAnswersByQuestion(question.getId());
		assertNotNull(answers);
		assertEquals(1, answers.size());
	}
	
	@Test
	public void testGetFakeAnswersByQuestion() {
		List<Answer> fakeAnswers = as.getAnswersByQuestion(-1);
		assertEquals(0, fakeAnswers.size());
	}
	
	*/
}
