package com.test;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		System.out.println("Enter the String >> ");
		Scanner scan=new Scanner(System.in);
		String input = scan.next();
		String originalStr = input;
		int n=input.length();
		String rev="";
		
		for(int i=n-1;i>=0;i--) {
		rev=rev+input.charAt(i);	
		}
		
		if(rev.equalsIgnoreCase(originalStr)) {
			System.out.println(input + " is Palindrom string");
		}else {
			System.out.println("Not palindrom string");
		}

	}

}
