package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class KiranFile {
	
	public static void main(String[] args) {
		
		
		for (int i = 1; i <=100; i++) {
			
	
		File file = new File("D:\\Java Lecture\\files(File Handling )\\Employee"+i+".txt");

		file.delete();
		
		System.out.println("File is deleted");
//		try {
//			
//		if(file.createNewFile()) {
//			System.out.println("File is created");
//
//		}else {
//			System.out.println("File already exist");
//		}
//		}catch(IOException e) {
//			
//			System.out.println(e.getMessage());
//		}
		
	}
	}
}
