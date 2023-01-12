package com.test;

public class PalindromeStr {

	public static void main(String[] args) {
		String s="Madam";
		String rev="";
		String newStr=s;
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(newStr)) {
			System.out.println("Yes!!! Got Palindrom String");
		}else {
			System.out.println("OOPs!!! NOT Palindrom String");
		}
		

	}

}
