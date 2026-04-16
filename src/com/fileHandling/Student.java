package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class Student {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			File file = new File("D:\\Java Lecture\\files(File Handling )\\student" + i + ".txt");

			try {

				if (file.createNewFile()) {

					System.out.println("File is Created");
				} else {

					System.out.println("File already exist");
				}

			} catch (IOException e) {

				System.out.println(e.getMessage());

			}
		}
	}
}
