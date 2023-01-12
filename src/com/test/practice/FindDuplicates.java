package com.test.practice;

public class FindDuplicates {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		int b[]= {60,20,10,80,90};
		
		System.out.println("Duplicate Elements in array are >>");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

		

	}

}
