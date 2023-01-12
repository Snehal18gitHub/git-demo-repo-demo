package com.test;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the Number >> ");
		int n=scan.nextInt();
		int count=0;
		if(n>1) {
			//Logic for prime number
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("YES!!! Number is prime");
			}else {
				System.out.println("NO!!! Number is not prime");
			}		
		}else {
			System.out.println("NO!!! Number is not prime");
		}
		
	}

}
