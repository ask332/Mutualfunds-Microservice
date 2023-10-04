package com.fundservice.exceptions;

public class IncorrectDistributionException extends Exception {
	private String message;

	public IncorrectDistributionException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
