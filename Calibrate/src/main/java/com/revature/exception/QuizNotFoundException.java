package com.revature.exception;

public class QuizNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9089447204202776889L;

	public QuizNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuizNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public QuizNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public QuizNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public QuizNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
