package com.test.practice;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {10,40,70,20,90};
		
		int serach_element=100;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==serach_element) {
				System.out.println("Element found at "+i);
				flag=true;
				break;
			}
		}
		
		if(flag=false) {
			System.out.println("Element NOT found...");
		}
		

	}

}
