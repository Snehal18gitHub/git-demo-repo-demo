package com.test.practice;

public class SumArrayElement {

	public static void main(String[] args) {
	
		int sum=0;
		int a[]= {2,4,6,5,7,8};
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of array element is >> "+sum);

	}

}
