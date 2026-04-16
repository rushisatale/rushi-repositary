package com.fileHandling;

import java.util.Scanner;

public class CRUDTest {

	
public static void main(String[] args) {

		
		CRUD crud = new CRUD();
		int attempts=0;
		
		do {
		System.out.println("\n 1.Create file \n 2.Write file \n 3.Read file \n 4.Delete file");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			crud.creatFile();
			break;
		case 2:
			crud.writeFile();
			break;
		case 3:
			crud.fileReader();
			break;
		case 4:
			crud.deleteFile();
			break;

		default:
			System.out.println("Enter valid choice");
			break;
		}
		
		attempts++;
		
		}while(attempts<4);
	}

}
