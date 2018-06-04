package com.revature.main;

import java.util.HashSet;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Account;
import com.revature.beans.Answer;
import com.revature.beans.Attempt;
import com.revature.beans.Quiz;
import com.revature.repository.AccountRepository;
import com.revature.repository.QuizRepository;
import com.revature.service.AttemptService;

public class Driver2 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");
		//QuizRepository qr = aac.getBean(QuizRepository.class);
		AttemptService as = aac.getBean(AttemptService.class);
		AccountRepository ar = aac.getBean(AccountRepository.class);
		Account acc = ar.getAccount(44);
		QuizRepository qr = aac.getBean(QuizRepository.class);
		Quiz q = qr.getQuiz(2);
		Attempt att = new Attempt(acc, q, new HashSet<Answer>());
		as.addAttempt(att);
		//qr.getQuiz(1).getQuestions().stream().forEach(a -> System.out.println(a.getValue()));
		aac.close();
		
	}
}
