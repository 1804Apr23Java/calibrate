package com.revature.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.service.AccountService;

public class SpringDriver {

	public static void main(String[] args) {

		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		AbstractApplicationContext aac = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println(aac.getBean("accountService", AccountService.class).getAccounts());
		
		aac.close();
	}
}
