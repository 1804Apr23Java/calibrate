package com.revature.exception;

public class LibraryNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6481554193614039029L;

	public LibraryNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibraryNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public LibraryNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LibraryNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public LibraryNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
