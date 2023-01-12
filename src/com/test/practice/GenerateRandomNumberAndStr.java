package com.test.practice;

import java.util.Random;

public class GenerateRandomNumberAndStr {

	public static void main(String[] args) {
		Random random=new Random();
		int randomInt=random.nextInt(1000);
		System.out.println(randomInt);
	}

}
