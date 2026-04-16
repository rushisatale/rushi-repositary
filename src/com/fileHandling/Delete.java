package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class Delete {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\Java Lecture\\files(File Handling )\\test.txt");
		
		file.delete();
		
		System.out.println("File is deleted");
		
//		try {
//			file.createNewFile();
//			
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//			
//		}
//		System.out.println("File is created");
	}

}
