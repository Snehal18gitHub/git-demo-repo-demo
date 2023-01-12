package com.test;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {

	public static void main(String[] args) {
		
		findDuplicateWords("Hi Java java with seleninum java with python");

	}
	
	
	
	public static void findDuplicateWords(String input) {
		
		Map<String,Integer> wordCount=new HashMap<>();
		String[] words = input.split(" ");
		for(String w:words) {
			
			if(wordCount.containsKey(w)) {
				wordCount.put(w.toLowerCase(),wordCount.get(w)+1 );
			}else {
				wordCount.put(w,1 );
			}

		}
		System.out.println("Word count is -> "+wordCount);
	}

}
