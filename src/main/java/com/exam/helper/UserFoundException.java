package com.exam.helper;

public class UserFoundException extends Exception{


	public UserFoundException() {
		super("User already exist in server with the same username!!");
		// TODO Auto-generated constructor stub
	}



	public UserFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


	

}
