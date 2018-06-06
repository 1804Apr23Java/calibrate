package com.revature.main;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Attempt;
import com.revature.service.AttemptService;

public class Driver2 {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");
		//QuizRepository qr = aac.getBean(QuizRepository.class);
		AttemptService as = aac.getBean(AttemptService.class);
		//Attempt att = new Attempt(acc, q, new HashSet<Answer>());
		//as.addAttempt(att);
		//qr.getQuiz(1).getQuestions().stream().forEach(a -> System.out.println(a.getValue()));
		//QuizService qs = aac.getBean(QuizService.class);
		
		List<Attempt> attempts = as.getAttemptByAccount(44);
		List<Attempt> attempts2 = as.getAttemptByAccount(43);
		
		System.out.println("a1: " + attempts);
		System.out.println("a2: " + attempts2);
		
		aac.close();
	}
}