package com.revature.main;

import org.apache.commons.codec.digest.DigestUtils;

public class SpringDriver {

	public static void main(String[] args) {

		String password = "pass40rD";
		String passwordEnc = DigestUtils.sha256Hex(password);
		
		System.out.println(passwordEnc);
		
	}
}
