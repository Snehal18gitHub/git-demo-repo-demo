package com.test.practice;

public class CountWhiteSpaces {

	public static void main(String[] args) {
		
		String str="Kalyan Home Center Mall";
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		
		System.out.println("Number of white spaces in given string is >>"+count);
		

	}

}
