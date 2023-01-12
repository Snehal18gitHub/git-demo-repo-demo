package com.test;

public class ThreadDemoClass {

	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println(i);
				}
				
			}
		});
		
		t.start();
		
		Thread t2=new Thread(()-> System.out.println("Inside Lambda thread"));
		t2.start();
	}

}
