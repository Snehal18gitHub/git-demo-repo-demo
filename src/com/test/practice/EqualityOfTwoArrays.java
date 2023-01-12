package com.test.practice;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,8,3,4,5};
		
		//condition 1: length should be equal
		//condition 2: element should be equal

		boolean flag=true;
		if(a.length==b.length) {
			//logic for checking equality of two arrays
			
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					flag=false;
				}
			}
		}else {
			flag=false;
		}
		if(flag==true) {
			System.out.println("Yes!! Arrays are equal..");
		}else {
			System.out.println("No!! Arrays are NOT equal..");
		}
		
	}

}
