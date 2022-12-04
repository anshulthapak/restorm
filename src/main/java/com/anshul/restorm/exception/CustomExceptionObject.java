package com.anshul.restorm.exception;

import org.springframework.stereotype.Component;

@Component
public class CustomExceptionObject {
	
	private String errorCode;
	private String errorMessage;
	private String stacktrace;
	public CustomExceptionObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomExceptionObject(String errorCode, String errorMessage, String stacktrace) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.stacktrace = stacktrace;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getStacktrace() {
		return stacktrace;
	}
	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}
	@Override
	public String toString() {
		return "CustomExceptionObject [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", stacktrace=" + stacktrace
				+ "]";
	}
	
	
}
