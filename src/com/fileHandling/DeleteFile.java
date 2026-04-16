package com.fileHandling;

import java.io.File;

public class DeleteFile {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\Java Lecture\\files(File Handling )\\Kiran.pdf");
		
		file.delete();
		
		System.out.println("File is deleted");
	}

}
