package com.stockservice.dto;

import java.time.LocalDateTime;

public class ErrorInfo {
	private String message;
	private String status;
	private LocalDateTime timestamp;

	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorInfo(String message, String status, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.status = status;
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "ErrorInfo [message=" + message + ", status=" + status + ", timestamp=" + timestamp + "]";
	}

}
