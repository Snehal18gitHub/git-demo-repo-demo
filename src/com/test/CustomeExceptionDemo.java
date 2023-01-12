package com.test;


public class CustomeExceptionDemo {
	
	public static void main(String[] args) throws insufficientBalanceException {
		throw new insufficientBalanceException("Insufficient balance in account");
	}
	
}

class insufficientBalanceException extends Exception {
	
	public insufficientBalanceException(String message){
		super(message);
	}
}
