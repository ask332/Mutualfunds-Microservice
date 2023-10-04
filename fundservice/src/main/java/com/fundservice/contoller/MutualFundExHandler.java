package com.fundservice.contoller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fundservice.dto.ErrorInfo;
import com.fundservice.exceptions.MutualFundNotFoundException;

@RestControllerAdvice
public class MutualFundExHandler {
	@ExceptionHandler(MutualFundNotFoundException.class)
	public ResponseEntity<ErrorInfo> handle404(MutualFundNotFoundException ex) {
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setMessage(ex.getMessage());
		errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
		errorInfo.setTimestamp(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
	}
}
