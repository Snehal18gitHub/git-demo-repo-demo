package com.test;

import java.util.Arrays;

//Count occurrence of every element in arrays

class Project1{
	    public static void main(String[] args) {
	     int arr[]={2,6,6,2,1,5,7,7,1,4,1,3,4,5};
	     countOccarance(arr);
	}

	public static void countOccarance(int arr[]){
	 Arrays.sort(arr);
	    for(int i=0;i<arr.length-1;i++){
	        int count=1;
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i]==arr[j])
	            count++;
	            else
	            break;
	        }
	        System.out.println(arr[i]+" -> "+count);
	        i+=count-1;
	    }
	    
	} 
	}
