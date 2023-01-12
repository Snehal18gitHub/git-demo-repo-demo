package com.test;

public class LongestPalindrom {

	public static void main(String[] args) {
		String str="My name is nitin and I can speak malayalam";
		
		String[] word= str.split(" ");
		for(String newword : word) {
			if(isPalindrome(newword)) {
				System.out.println(newword+" is palindrom");
			}
		}
	}
	
	//nitin
	public static boolean isPalindrome(String input) {
		
		int i=0;
		int j=input.length()-1;
		
		while(j>i) {
			if(input.charAt(i)!=input.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
