package com.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharStr {

	public static void main(String[] args) {
		/*
		String str="SSSnehal";
		char[] strArr = str.toCharArray();
		
		Map<Character,Integer> charMap=new HashMap<>();
	
		for(char c:strArr) {
			Integer count = charMap.get(c);
			if(count==null) {
				charMap.put(c, 1);
			}else {
				charMap.put(c, ++count);
			}
			
		}
		Set<Entry<Character, Integer>> entryset = charMap.entrySet();
		for(Entry<Character, Integer> entry:entryset) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
			*/
		
		
		String str="ssnnehhal";
		int count=0;
		char[] strArr = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;i<str.length();j++) {
				if(strArr[i]==strArr[j]) {
					System.out.println(strArr[j]);
					count++;
					break;
				}
			}
		
		
		
		}

	}

}
