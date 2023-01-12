package com.gameshashtra;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		int a[]= {2,2,4,5,5,6,7,8,9,9,9};
		
		int temp[]= new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j]=a[i];
				j++;
			}
		}
		temp[j]=a[a.length-1];
		
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		

	}

}
