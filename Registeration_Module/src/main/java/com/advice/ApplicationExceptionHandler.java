package com.advice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandler {
   
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> invalidExceptionArgument(MethodArgumentNotValidException ex)
	{     Map<String,String> res=new HashMap<>();
	        
	ex.getBindingResult().getAllErrors().forEach((error)->{ 
		String field = ((FieldError)error).getField();
	    String message = error.getDefaultMessage();
	    res.put(field, message);
	});
	return new ResponseEntity<Map<String,String>>(res,HttpStatus.BAD_REQUEST);
		}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElement(NoSuchElementException elementException)
	{
		return new 
		ResponseEntity<String>("No value present in DB Please Check Your Input",
				HttpStatus.NOT_FOUND);
	}		
	
	
	
	}
