package com.test;

public class RevStr {

	public static void main(String[] args) {
		
		String s="good morning";
		String rev="";
		int n=s.length();
		for(int i=n-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

	}

}
