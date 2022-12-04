package com.anshul.restorm.exception;

public class FieldNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String msg;
	
	public FieldNotFoundException() {
		super();
		
	}
	
	public FieldNotFoundException(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "FieldNotFoundException [code=" + code + ", msg=" + msg + "]";
	}
	
	
	
	

}
