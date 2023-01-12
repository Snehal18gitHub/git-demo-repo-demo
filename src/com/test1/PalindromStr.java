package com.test1;

public class PalindromStr {

	public static void main(String[] args) {
		String str="Madam";
		String newStr=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equalsIgnoreCase(newStr)) {
			System.out.println("Its PALINDROM String");
		}else {
			System.out.println("NOT !! PALINDROM String");
		}

	}

}
