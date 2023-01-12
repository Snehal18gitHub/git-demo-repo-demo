package com.test;

public class LargestSmallestArrayElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,7,10};

		int largest=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println("Largest Number is -> "+largest);
		
		int smallest=2;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println("smallest Number is -> "+smallest);
				
	}

}
