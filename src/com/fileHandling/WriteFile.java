package com.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String[] args) {
		
		try {
		FileWriter fw = new FileWriter("D:\\Java Lecture\\files(File Handling )\\student.txt");
		fw.write("Hello Rushikesh Welcome to Java Learning Platform");
		System.out.println("Data added in file ");
		fw.flush();
		
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
