package com.test.practice;

public class PalindromNumber {

	public static void main(String[] args) {
		int n=34543;
		int m=n;
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==m) {
			System.out.println("Yes !! its palindrom number");
		}else {
			System.out.println("No !! its not palindrom number");
		}

	}

}
