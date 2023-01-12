package com.test.practice;

public class FindLargestOfThree {

	public static void main(String[] args) {
		
		int a=10,b=20,c=30;
		if(a>b && a>c) {
			System.out.println(a+" is largest number among all three ");
		}else if(b>a && b>c) {
			System.out.println(b+ " is largest number among all three ");
		}else {
			System.out.println(c+ " is largest number among all three ");
		}

	}

}
