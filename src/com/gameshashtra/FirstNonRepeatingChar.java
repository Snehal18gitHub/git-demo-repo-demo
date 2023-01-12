package com.gameshashtra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingChar {
	
	//with collection framework
	public static Character getString(String str){
		
		Map<Character, Integer> charMap =new HashMap<>();
		char[] strArray = str.toCharArray();
		for(char c:strArray) {
			Integer count = charMap.get(c);
			if(count==null) {
				charMap.put(c, 1);
			}else {
				charMap.put(c, ++count);
			}
		}
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()<=1) {
				System.out.println(entry.getKey());
			}
		}
		
		
		
		
		
				return 0;
		
	}
	
	/*public static Character getNonRepeating(String str) {
		
		char[] strArr = str.toCharArray();
		Set<Character> charSet=new HashSet<>();
		for(char s:strArr) {
			if(charSet.add(s)==true) {
				System.out.println(s);
			}
			
		}
		
		
		
		return charSet;
		
	}*/
	
	//withithout collection
	
	

	public static void main(String[] args) {
		//first non repeating character in given string "aabbbaacdd"
		//String str="AABCDBE";
		String str="aabbbaacdd";
		/*
		for(int i=0;i<str.length();i++) {
			boolean flag=false;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					flag=true;
					
				}
			}
			
			if(flag) {
				System.out.println(str.charAt(i));
				break;
			}
			*/
		/*
		char[] strArr = str.toCharArray();
		Set<Character> charSet=new HashSet<>();
		for(char s:strArr) {
			if(charSet.add(s)==false) {
				System.out.println(s);
			}
			
		}*/
		
		
		
		Map<Character, Integer> charMap =new HashMap<>();
		char[] strArray = str.toCharArray();
		for(char c:strArray) {
			Integer count = charMap.get(c);
			if(count==null) {
				charMap.put(c, 1);
			}else {
				charMap.put(c, ++count);
			}
		}
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()<=1) {
				System.out.println(entry.getKey());
			}
		}
		
		
		
		
		
		
		
		}

	}


