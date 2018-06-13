package com.revature.exception;

public class InvalidLoginException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5277122742412890255L;

	public InvalidLoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidLoginException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidLoginException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidLoginException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
