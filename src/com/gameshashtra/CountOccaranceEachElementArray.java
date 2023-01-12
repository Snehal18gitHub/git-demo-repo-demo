package com.gameshashtra;

import java.util.Arrays;

public class CountOccaranceEachElementArray {

	public static void main(String[] args) {
		int a[]= {9,5,7,6,8,7,9,8,4,3,2,5,2,2};
		
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


