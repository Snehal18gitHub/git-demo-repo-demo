package com.test1;

public class SwapNum {

	public static void main(String[] args) {
		//with using third variable
		/*
		int a=10;
		int b=20;
		int temp;
		System.out.println("Before swapping : "+a +" & "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping : "+a +" & "+b);
		*/
		
		//without using third variable
		int a=10;
		int b=20;
		System.out.println("Before swapping : "+a +" & "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping : "+a +" & "+b);

	}

}
