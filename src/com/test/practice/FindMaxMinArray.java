package com.test.practice;

public class FindMaxMinArray {

	public static void main(String[] args) {
		
		int a[]= {10,45,70,20,50,60,11};
		
		int max=10;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum value in array is >> "+max);
		
		int min=45;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value in array is >> "+min);

	}

}
