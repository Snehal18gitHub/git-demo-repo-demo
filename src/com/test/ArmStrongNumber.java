package com.test;

import java.util.Scanner;

public class ArmStrongNumber {
	
	/*
	 * 153=(1*1*1)+(5*5*5)+(3*3*3)
	 *    =1+125+27
	 *    =153 
	 */

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Number :");
		int input = scan.nextInt();
		if(isArmstrong(input)) {
			System.out.println(input+" is Armstrong Number");
		}else {
			System.out.println(input+" is not Armstrong Number");
		}
		
	}
	
	public static Boolean isArmstrong(int input) {
		int originalNum=input;
		int sum=0;
		while(input>0) {
			int rem=input%10;
			input=input/10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==originalNum) {
			return true;
		}		
		return false;
	}

}
