package com.test1;

import java.util.HashMap;
import java.util.Map;

public class CountWord {

	public static void main(String[] args) {
		String str="This is java programming demo";
		String[] words = str.split(" ");
		Map<String, Integer> map=new HashMap<>();
		for(int i=0;i<words.length;i++) {
			if(map.containsKey(words[i])) {
				Integer count = map.get(words[i]);
				map.put(words[i], count+1);
			}else {
				map.put(words[i], 1);
			}
		}
		System.out.println(map);

	}

}
