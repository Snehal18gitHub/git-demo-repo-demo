package com.test.practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int a[] = { 20, 40, 60, 80, 100, 30 };

		// 1) Array should be in sorted
		// 2) mid=(l+h)/2

		// Bubble Sort
		System.out.println("Before Sorting >> " + Arrays.toString(a));

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				int temp;
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		System.out.println("After Sorting >> " + Arrays.toString(a));

		// Logic for binary sort

		int key = 30;
		boolean flag = false;
		int l = 0;
		int h = a.length - 1;

		while (l <= h) {

			int mid = (l + h) / 2;

			if (key == a[mid]) {
				System.out.println("Yes!! element is found..");
				flag = true;
				break;
			}
			if (key > a[mid]) {
				l = mid + 1;
			}
			if (key < a[mid]) {
				h = mid - 1;
			}

		}

		if (flag == false) {
			System.out.println("Element is NOT found..");
		}

	}

}
