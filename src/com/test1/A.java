package com.test1;

public class A {
	public static void m1(String str) {
		System.out.println("String");
	}
	
	public static void m2(Integer interger) {
		System.out.println("Interger");
		
	}
	
	public static void m3(Object obj) {
		System.out.println("Object");
		
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.m1("123");
	}

}
