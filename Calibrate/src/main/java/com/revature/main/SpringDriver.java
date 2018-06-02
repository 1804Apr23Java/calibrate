package com.revature.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {

	public static void main(String[] args) {

		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println(ac.getBean("sessionFactory"));
		
		ac.close();
	}

}
