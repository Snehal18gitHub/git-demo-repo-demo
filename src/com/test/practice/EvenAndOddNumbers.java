package com.test.practice;

public class EvenAndOddNumbers {

	public static void main(String[] args) {
		int a[]= {3,2,4,5,6,7,1,9};
		
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println("Even number >> ");
				System.out.println(a[i]);
			}else {
				System.out.println("Odd Number >> ");
				System.out.println(a[i]);
			}
		}

	}

}
