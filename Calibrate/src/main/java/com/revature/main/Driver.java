package com.revature.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.AttemptService;

public class Driver {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");
		
		//AccountService acs = aac.getBean(AccountService.class);
		AttemptService as = aac.getBean(AttemptService.class);
		//Attempt att = new Attempt(acc, q, new HashSet<Answer>());
		//as.addAttempt(att);
		//qr.getQuiz(1).getQuestions().stream().forEach(a -> System.out.println(a.getValue()));
		//QuizService qs = aac.getBean(QuizService.class);
		
		/*
		List<Attempt> attempts = as.getAttemptByAccount(44);
		List<Attempt> attempts2 = as.getAttemptByAccount(43);
		
		System.out.println("a1: " + attempts);
		System.out.println("a2: " + attempts2);
		*/
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(318);
		l.add(294);
		
		as.addAttempt(44, 1, l);
		
		aac.close();
	}
}