package com.test.practice;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,7,8,9};
		
		System.out.println("Missing Numbers are >> ");
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
