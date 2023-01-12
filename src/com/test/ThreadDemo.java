package com.test;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Inside Runnable run method....");
			}

		});

		t.start();

		Thread t2 = new Thread(() -> System.out.println("Inside Lambda run method..."));
		t2.start();

	}

}
