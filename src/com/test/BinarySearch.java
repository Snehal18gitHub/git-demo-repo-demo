package com.test;

public class BinarySearch {
	public static void main(String[] args) {
		// L=0; H=a.length()  Mid=(l+H)/2
		
		int a[]= {3,6,9,12,15,18,21};
		int l=0, h=a.length-1;
		int key=18;
		boolean flag=false;
		
		while(l<=h) {
			int mid=(l+h)/2;
			if(key==a[mid]) {
				System.out.println("Yes...Element is found");
				flag=true;
				break;
			}
			if(key<a[mid]) {
				h=mid-1;
			}
			if(key>a[mid]) {
				l=mid+1;
			}
		}
		
		if(flag==false) {
			System.out.println("Elenemt NOT found");
		}
		
		
	}

}
