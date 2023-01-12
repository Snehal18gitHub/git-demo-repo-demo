package com.test.practice;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

public class ReadDataFromTxtFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		try {
//			File file = new File("C:\\Users\\HP\\Desktop\\abc.txt");
//			Scanner scan = new Scanner(file);
//
//			while (scan.hasNextLine()) {
//				System.out.println(scan.nextLine());
//			}
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str= br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();

	}

}
