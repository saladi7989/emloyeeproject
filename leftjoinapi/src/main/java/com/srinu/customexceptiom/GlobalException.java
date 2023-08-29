package com.srinu.customexceptiom;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(Exception.class)
	public String AllException(Exception ex) {
		 StackTraceElement ar[]= ex.getStackTrace();
		 System.out.println(ar[0]);
		return null;
		
	}
	

}
