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
		Account ac6 = accountS.addAccount(new Account("wh@yahoo.com", "pass", "William", "Helton"));
		Account ac7 = accountS.addAccount(new Account("jlm@yahoo.com", "pass", "Jose Luis", "Munoz"));		

		Library l1 = libraryS.addLibrary("Java", ac5.getId());
		Library l2 = libraryS.addLibrary("HTML/CSS", ac5.getId());
		Library l3 = libraryS.addLibrary("Spring", ac5.getId());
		Library l4 = libraryS.addLibrary("Angular", ac5.getId());
		
		libraryS.updateLibrary(l3.getId(), Status.PENDING);
		libraryS.updateLibrary(l4.getId(), Status.PUBLIC);

		List<AnswerDTO> a11 = new ArrayList<AnswerDTO>();
		a11.add(new AnswerDTO(true, "instanceof"));
		a11.add(new AnswerDTO(false, "typeof"));
		a11.add(new AnswerDTO(false, "is"));
		a11.add(new AnswerDTO(false, "isinstanceof"));
		Question q11 = questionS.addQuestionToLibrary(
				"Which operator returns true if the left operand is an object that is an instance of the right operand class?",
				1, l1.getId(), a11);

		List<AnswerDTO> a12 = new ArrayList<AnswerDTO>();
		a12.add(new AnswerDTO(true, "true"));
		a12.add(new AnswerDTO(false, "false"));
		Question q12 = questionS.addQuestionToLibrary(
				"True or False: If one class can be described as a \"specific example\" of another,"
						+ " that relationship can be described through inheritance",
				2, l1.getId(), a12);

		List<AnswerDTO> a13 = new ArrayList<AnswerDTO>();
		a13.add(new AnswerDTO(false, "true"));
		a13.add(new AnswerDTO(true, "false"));
		Question q13 = questionS.addQuestionToLibrary(
				"True or False: Inheritance creates a \"has-a(n)\" relationship between two objects", 2, l1.getId(),
				a13);

		
		List<AnswerDTO> a21 = new ArrayList<AnswerDTO>();
		a21.add(new AnswerDTO(true, "h1{ }"));
		a21.add(new AnswerDTO(false, "h1.all{ }"));
		a21.add(new AnswerDTO(false, "all.h1{ }"));
		a21.add(new AnswerDTO(false, "Not possible"));
		Question q21 = questionS.addQuestionToLibrary("Select all h1 elements in CSS.", 1, l2.getId(), a21);

		List<AnswerDTO> a22 = new ArrayList<AnswerDTO>();
		a22.add(new AnswerDTO(true, "style"));
		a22.add(new AnswerDTO(false, "head"));
		a22.add(new AnswerDTO(false, "form"));
		a22.add(new AnswerDTO(false, "script"));
		Question q22 = questionS.addQuestionToLibrary("Which tag is used to define CSS inside of an HTML document?", 1, l2.getId(), a22);
		
		
		List<AnswerDTO> a23 = new ArrayList<AnswerDTO>();
		a23.add(new AnswerDTO(true, "hex color code"));
		a23.add(new AnswerDTO(false, "byte code"));
		a23.add(new AnswerDTO(false, "text code"));
		a23.add(new AnswerDTO(false, "None of the others"));
		Question q23 = questionS.addQuestionToLibrary("What does the hexadecimal number (#FA0AB1) represent in CSS?", 3, l2.getId(), a23);
		
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