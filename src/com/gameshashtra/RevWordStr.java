package com.gameshashtra;

public class RevWordStr {

	public static void main(String[] args) {

		String str="Good afternoon";
		
		String[] words = str.split(" ");
		String revsereString="";
		for(String w:words) {
			
			String revsrseWord="";
			
			for(int i=w.length()-1;i>=0;i--) {
				revsrseWord=revsrseWord+w.charAt(i);
			}
			
			revsereString=revsereString+revsrseWord+" ";
		}
		System.out.println(revsereString);

	}

}
