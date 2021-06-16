package com.spring.rpm.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.spring.rpm.dto.ErrorResponseDto;
import com.spring.rpm.exception.CartEmptyException;

@RestControllerAdvice
public class GlobalExceptionHandler 
{
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler({CartEmptyException.class})
	public ErrorResponseDto productNotFoundException(Exception exception,HttpServletRequest request )
	{
		return new ErrorResponseDto(new Date(), HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase(), exception.getMessage(), request.getRequestURI());
	}
	
	
	@ExceptionHandler({Exception.class})
	public ErrorResponseDto globalException(Exception exception,HttpServletRequest request)
	{
		return new ErrorResponseDto(new Date(), HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase(), exception.getMessage(), request.getRequestURI());
	}
		
	
}
