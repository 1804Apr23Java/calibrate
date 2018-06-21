package com.revature.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Account;
import com.revature.beans.Answer;
import com.revature.beans.Attempt;
import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.beans.Quiz;
import com.revature.beans.Status;
import com.revature.dto.AnswerDTO;
import com.revature.service.AccountService;
import com.revature.service.AttemptService;
import com.revature.service.LibraryService;
import com.revature.service.QuestionService;
import com.revature.service.QuizService;

public class Driver {

	public static void main(String[] args) {

		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");

		AccountService accountS = aac.getBean(AccountService.class);
		LibraryService libraryS = aac.getBean(LibraryService.class);
		QuestionService questionS = aac.getBean(QuestionService.class);
		QuizService quizS = aac.getBean(QuizService.class);
		AttemptService attemptS = aac.getBean(AttemptService.class);
		
		Account ac1 = accountS.addAccount(new Account("rt@gmail.com", "pass", "Robert", "Truong", true));
		Account ac5 = accountS.addAccount(new Account("rt@yahoo.com", "pass", "Robert", "Truong"));
		Account ac6 = accountS.addAccount(new Account("wh@yahoo.com", "pass", "Robert", "Truong"));
		Account ac7 = accountS.addAccount(new Account("jlm@yahoo.com", "pass", "Robert", "Truong"));		

		Library l1 = libraryS.addLibrary("Java", ac5.getId());
		Library l2 = libraryS.addLibrary("HTML/CSS", ac5.getId());
		Library l3 = libraryS.addLibrary("Spring", ac5.getId());
		Library l4 = libraryS.addLibrary("Angular", ac5.getId());
		
		libraryS.updateLibrary(l3.getId(), Status.PENDING);
		libraryS.updateLibrary(l4.getId(), Status.PUBLIC);

		List<AnswerDTO> a1 = new ArrayList<AnswerDTO>();
		a1.add(new AnswerDTO(0, true, "instanceof", 0, false));
		a1.add(new AnswerDTO(0, false, "typeof", 0, false));
		a1.add(new AnswerDTO(0, false, "is", 0, false));
		a1.add(new AnswerDTO(0, false, "isinstanceof", 0, false));
		Question q1 = questionS.addQuestionToLibrary(
				"Which operator returns true if the left operand is an object that is an instance of the right operand class?",
				1, l1.getId(), a1);

		List<AnswerDTO> a2 = new ArrayList<AnswerDTO>();
		a2.add(new AnswerDTO(0, true, "true", 0, false));
		a2.add(new AnswerDTO(0, false, "false", 0, false));
		Question q2 = questionS.addQuestionToLibrary(
				"True or False: If one class can be described as a \"specific example\" of another,"
						+ " that relationship can be described through inheritance",
				2, l1.getId(), a2);

		List<AnswerDTO> a3 = new ArrayList<AnswerDTO>();
		a3.add(new AnswerDTO(0, false, "true", 0, false));
		a3.add(new AnswerDTO(0, true, "false", 0, false));
		Question q3 = questionS.addQuestionToLibrary(
				"True or False: Inheritance creates a \"has-a(n)\" relationship between two objects", 2, l1.getId(),
				a3);

		List<AnswerDTO> a4 = new ArrayList<AnswerDTO>();
		a4.add(new AnswerDTO(0, true, "h1{ }", 0, false));
		a4.add(new AnswerDTO(0, false, "h1.all{ }", 0, false));
		a4.add(new AnswerDTO(0, false, "all.h1{ }", 0, false));
		a4.add(new AnswerDTO(0, false, "Not possible", 0, false));
		Question q4 = questionS.addQuestionToLibrary("Select all h1 elements in CSS.", 1, l2.getId(), a4);

		List<AnswerDTO> a5 = new ArrayList<AnswerDTO>();
		a5.add(new AnswerDTO(0, true, "style", 0, false));
		a5.add(new AnswerDTO(0, false, "head", 0, false));
		a5.add(new AnswerDTO(0, false, "form", 0, false));
		a5.add(new AnswerDTO(0, false, "script", 0, false));
		Question q5 = questionS.addQuestionToLibrary("Which tag is used to define CSS inside of an HTML document?", 1, l2.getId(), a5);
		
		
		List<AnswerDTO> a6 = new ArrayList<AnswerDTO>();
		a6.add(new AnswerDTO(0, true, "hex color code", 0, false));
		a6.add(new AnswerDTO(0, false, "byte code", 0, false));
		a6.add(new AnswerDTO(0, false, "text code", 0, false));
		a6.add(new AnswerDTO(0, false, "None of the others", 0, false));
		Question q6 = questionS.addQuestionToLibrary("What does the hexadecimal number (#FA0AB1) represent in CSS?", 3, l2.getId(), a6);
		
		List<Integer> libraryIds = new ArrayList<Integer>();
		libraryIds.add(l1.getId());
		libraryIds.add(l2.getId());
		
		Quiz qz1 = quizS.generateQuiz("Java and CSS", libraryIds, 3);
		
		List<Integer> answerIds = new ArrayList<Integer>();
		
		for (Question question: qz1.getQuestions()) {
			List<Answer> answers = new ArrayList<Answer>(question.getAnswers());
			Collections.shuffle(answers);
			answerIds.add(answers.get(0).getId());
		}
		
		Attempt at1 = attemptS.addAttempt(ac5.getId(), qz1.getId(), answerIds);
		
		aac.close();
	}
}