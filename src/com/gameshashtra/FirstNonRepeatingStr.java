package com.gameshashtra;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingStr {
	
	public static void main(String[] args) {
		
		String str="aabbbaacdd";
		char[] strArray = str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<>();
		
		for(char c:strArray) {
			Integer count = charMap.get(c);
			if(count==null) {
				charMap.put(c, 1);
			}else {
				charMap.put(c, ++count);
			}
			
		}
		
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for( Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()<=1) {
				System.out.println(entry.getKey());
			}
		}
	
		
	}

}
