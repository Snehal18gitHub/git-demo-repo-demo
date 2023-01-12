package com.test.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// condition 1: n>1
		// condition 2: count==2
		
		int n=7;
		int count=0;
		
		if(n>1) {
			
			//logic
			
			for(int i=1;i<=n;i++) {
				
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Yes!! its prime number...");
			}else {
				System.out.println("No!! its not prime number..");
			}
			
		}else {
			System.out.println("No!! its not prime number..");
		}

	}

}
