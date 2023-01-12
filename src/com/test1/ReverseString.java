package com.test1;

public class ReverseString {

	public static void main(String[] args) {
		//Reverse string char by char
		/*
		String str=" Good Morning";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		*/
		
		
		// Reverse String word by word
		String str1="Bajaj Finsver";
		String[] words = str1.split(" ");
		
		String revString="";
		for(String w:words) {
			String revWord="";
			for(int i=w.length()-1;i>=0;i--) {
				revWord=revWord+w.charAt(i);
			}
			revString=revString+revWord+" ";
		}
		System.out.println(revString);

	}

}
