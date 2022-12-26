package com.exam.helper;

public class UserNotFoundException extends Exception {

	public UserNotFoundException() {
		// TODO Auto-generated constructor stub
		super("User Not Found With this Username");
	}

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
