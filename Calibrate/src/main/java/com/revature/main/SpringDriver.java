package com.revature.main;

import org.apache.commons.codec.digest.*;

public class SpringDriver {

	public static void main(String[] args) {

		String password = "pass4ord";
		String passwordEnc = DigestUtils.sha256Hex(password);
		
		System.out.println(passwordEnc);
		
	}
}
