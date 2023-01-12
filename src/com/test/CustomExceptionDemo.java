package com.test;

public class CustomExceptionDemo {
	
	public static void main(String[] args) throws CustomException {
		
		throw new CustomException("This is custom exception");
	}

}

class CustomException extends Exception{
	
	public CustomException(String message) {
		super(message);
				
	}
	
}
