package com.fundservice.exceptions;

public class MutualFundNotFoundException extends Exception{
	private String message;

	public MutualFundNotFoundException(String message) {
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
