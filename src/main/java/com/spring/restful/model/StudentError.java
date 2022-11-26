package com.spring.restful.model;

public class StudentError {
	private String statusCode;
	
	private String message;
	
	private String timeStamp;

	public StudentError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
}
