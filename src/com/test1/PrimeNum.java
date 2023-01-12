package com.test1;

public class PrimeNum {

	public static void main(String[] args) {
		int n=7;
		if(n>1) {
			//Logic for prime number
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("YES!! Number is prime");
			}else {
				System.out.println("NO!!! Number is not prime");
			}
			
						
		}else {
			System.out.println("NO!!! Number is not prime");
		}

	}

}
