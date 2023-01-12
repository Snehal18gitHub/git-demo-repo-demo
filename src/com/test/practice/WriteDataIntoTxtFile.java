package com.test.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataIntoTxtFile  {

	
	public static void main(String[] args) {
		
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\HP\\Desktop\\abc.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(" Welcome ");
			bw.write(" Welcome to java ");
			bw.write(" Welcome to java and python ");
			System.out.println(" Written inside the file.. ");
			
//			FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\abc.txt");
//			BufferedReader br = new BufferedReader(fr);
//			String str;
//			while((str= br.readLine())!=null) {
//				System.out.println(str);
//			}
//			
			File file = new File("C:\\Users\\HP\\Desktop\\abc.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
						
			bw.close();
			 	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}

}
