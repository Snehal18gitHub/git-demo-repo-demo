package com.test.practice;

public class Fibona {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13
		/*
		 * a    b    sum(a+b)
		 *      a      b       sum(a+b)
		 *             a          b       sum(a+b)
		 *             
		 */
		
		int a=0, b=1, sum=0;
		System.out.println("Fibonaci series  >>");
		System.out.print(a + " " + b);
		
		//print fibonaci till n=10
		
		for(int i=2;i<10;i++) {
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
		
		
		
	}

}
