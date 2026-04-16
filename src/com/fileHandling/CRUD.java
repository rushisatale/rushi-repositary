package com.fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CRUD {

	void creatFile() {

		File file = new File("D:\\Java Lectures\\files(File Handling )\\Demo.txt");

		try {
			file.createNewFile();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.err.println("File is created");

	}

	void writeFile() {

		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\Java Lectures\\files(File Handling )\\Demo.txt");

			fw.write("\n=========Welcome=========");
			fw.write("\nJava is general purpose,High level,static,compiled,object-oriented programming language\n");

			System.err.println("Data is added");
			fw.flush();

		} catch (IOException i) {
			i.printStackTrace();
		} finally {
			try {

				fw.close();
			} catch (IOException e) {
				e.getMessage();
			}

		}
	}

	void fileReader() {

		try {
			FileReader fr = new FileReader("D:\\Java Lectures\\files(File Handling )\\Demo.txt");

			int data;

			while ((data = fr.read()) != -1) {

				System.out.print((char) data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void deleteFile() {

		File file = new File("D:\\Java Lectures\\files(File Handling )\\Demo.txt");

		file.delete();

		System.err.println("File is deleted");
	}

	
}
