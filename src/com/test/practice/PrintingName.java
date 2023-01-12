package com.test.practice;

public class PrintingName {

	public static void main(String[] args) {
		// WAP to print name 100 times without using loop
		
		String name="Snehal";
		String newName="i";
		newName=newName.replaceAll("i", "iiiiiiiiii");
		newName=newName.replaceAll("i", "iiiiiiiiii");
		newName=newName.replaceAll("i", name+"\n");
		System.out.print(newName);
		

	}

}
