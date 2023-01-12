package com.test;

public class prime {

	public static void main(String[] args) {
		int n = 11;
		int count = 0;
		if (n > 1) {
			// Logic for prime

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("Yes!!! Number is prime number");
			} else {
				System.out.println("No!!! Number is NOT prime");
			}

		} else {
			System.out.println("No!!! Number is NOT prime");
		}

	}

}
