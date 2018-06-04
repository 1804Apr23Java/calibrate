package com.revature.beans;

public enum Status {

	PRIVATE(0), PENDING(1), PUBLIC(2);

	private int code;

	private Status(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static Status fromCode(int code) {
		switch (code) {
		case 0:
			return Status.PRIVATE;
		case 1:
			return Status.PENDING;
		case 2:
			return Status.PUBLIC;
		default:
			throw new IllegalArgumentException("Code [" + code + "] not supported.");
		}
	}

}
