package com.anshul.restorm.exception;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomErrorResponse extends ResponseEntityExceptionHandler{
	
	@Autowired
	private CustomExceptionObject exceptionObject;
	
	@ExceptionHandler(FieldNotFoundException.class)
	public ResponseEntity<CustomExceptionObject> fieldNotFoundHandler(FieldNotFoundException fe){
		exceptionObject.setErrorCode(fe.getCode());
		exceptionObject.setErrorMessage(fe.getMsg());
		exceptionObject.setStacktrace(fe.getLocalizedMessage());
		return new ResponseEntity<CustomExceptionObject>(exceptionObject, HttpStatus.BAD_REQUEST);
	}










	



	

	







	





	
	
	
	
}
