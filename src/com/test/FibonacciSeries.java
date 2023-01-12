package com.test;

public class FibonacciSeries {
	
	//0 1 1 2 3 5 8
	
	public static void main(String[] args) {
		
		int a=0, b=1, sum;
		
		System.out.print(a + " " + b);
		
		for(int i=2;i<10;i++) {
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
			
		}
		
	}

}
