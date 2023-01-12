package com.test.practice;

public class CountNumberOfDigitsInNum {

	public static void main(String[] args) {
	
		int n=34567;
		int count=0;
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			count++;
		}
		System.out.println("Number of digit in given number is >> "+count);

	}

}
