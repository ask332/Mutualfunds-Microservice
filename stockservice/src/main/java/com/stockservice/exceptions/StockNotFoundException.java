package com.stockservice.exceptions;

public class StockNotFoundException extends Exception {
	private String message;

	public StockNotFoundException(String message) {
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
