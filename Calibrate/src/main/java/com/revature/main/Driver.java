package com.revature.main;

import org.hibernate.Session;
import com.revature.util.HibernateUtil;

public class Driver {

	public static void main(String[] args) {
		init();
	}

	public static void init() {

		Session s = HibernateUtil.getSession();
		System.out.println(s.isOpen());
		s.close();
		System.out.println(s.isOpen());
		HibernateUtil.closeSessionFactory();

	}

}
