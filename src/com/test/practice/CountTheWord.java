package com.test.practice;

import java.util.Scanner;

public class CountTheWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=scan.nextLine(); //Welcome to the Java world
		int count=1;
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number of the words in given string are >> "+count);
		
	}

}
