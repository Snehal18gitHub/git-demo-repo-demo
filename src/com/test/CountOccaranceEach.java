package com.test;

import java.util.Arrays;

public class CountOccaranceEach {

	public static void main(String[] args) {
		
		int a[]= {7,9,3,6,1,8,3,5,3,5,7,1,2,5,5,3};
		Arrays.sort(a);
				
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}else
					break;
			}
			System.out.println(a[i]+" -> "+count);
			i+=count-1;
		}

	}

}
