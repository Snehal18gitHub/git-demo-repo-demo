package com.test.practice;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String s="Java Programming java oops";
		
		int Total=s.length();
				
		s=s.replaceAll("a", "");
		
		int LengthAfter = s.length();
		
		int count=Total-LengthAfter;
		
		System.out.println("Count of occurance of 'a' character in given string is >> "+count);
		
	}

}
