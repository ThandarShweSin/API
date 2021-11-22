package com.kyn.KnowYourNeighbour.payload;


public class RegisterResponse {
	private boolean success;
	private String message;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public RegisterResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}	
	
	
}
