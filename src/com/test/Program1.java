package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Program1 {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,5,7,10,8,3);
		System.out.println("Output::1");
		list.stream().mapToInt(n->n*n).forEach(System.out::println);
		System.out.println("Output::2");
		list.stream().mapToInt(n->n*n).filter(n->n>=100).forEach(System.out::println);
		System.out.println("Output::3");
		OptionalDouble option = list.stream().mapToInt(n->n*n).average();
		System.out.println("Average >> "+option.getAsDouble());
	}

}
