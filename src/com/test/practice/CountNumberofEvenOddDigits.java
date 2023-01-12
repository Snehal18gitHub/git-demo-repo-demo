package com.test.practice;

public class CountNumberofEvenOddDigits {

	public static void main(String[] args) {
		int n=5612389;
		int evencount=0;
		int oddcount=0;
		while(n!=0) {
			int rem=n%10;
			if(rem%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			n=n/10;
		}
		System.out.println("Even Digit count >> "+evencount);
		System.out.println("Odd Digit count >> "+oddcount);

	}

}
