package com.test;

public class MissingNumber {
	public static void main(String[] args) {
		// 1 to n non duplicate numbers are given in array
		
		int a[]= {1, 2, 4, 6, 7, 8};
		
		System.out.println("Missing Numbers >> ");
		for(int i=1;i<=a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
