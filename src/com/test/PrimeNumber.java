package com.test;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n=5;
		int count=0;
		
		if(n>1) {
			
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Yes...Its Prime number....");
			}else {
				System.out.println("NO...Its not prime number");	
			}
			
			
			
		}else {
			System.out.println("NO...Its not prime number");	
		}
		
	}

}
