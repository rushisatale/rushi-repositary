package com.fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) {
		
		try{
		FileReader fr = new FileReader("D:\\Java Lecture\\files(File Handling )\\employee.txt");
		
		int data ;
		while((data = fr.read())!= -1) {
			
			System.out.print((char)data);
		}
		
		}catch(IOException i) {
			i.printStackTrace();
		}
	}

}
