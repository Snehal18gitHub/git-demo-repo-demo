package com.test.practice;

public class PalindromStr {

	public static void main(String[] args) {
		String str="Madam";
		String strNew=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equalsIgnoreCase(strNew)) {
			System.out.println("Yes !!! Its palindrom String...");
		}else {
			System.out.println("No !!! Its not palindrom String...");
		}

	}

}
