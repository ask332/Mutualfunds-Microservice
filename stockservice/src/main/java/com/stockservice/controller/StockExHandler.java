package com.stockservice.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.stockservice.dto.ErrorInfo;
import com.stockservice.exceptions.StockNotFoundException;

@RestControllerAdvice // exception handler AOP
public class StockExHandler {

	@ExceptionHandler(StockNotFoundException.class)
	public ResponseEntity<ErrorInfo> handle404(StockNotFoundException ex) {
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setMessage(ex.getMessage());
		errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
	}

}
