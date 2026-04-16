package com.do_while;

import java.util.Scanner;

public class Student_Management {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = "";
		String add = "";
		int age = 0;
		double marks = 0;
		char grade = ' ';
		String gender = "";

		do {
			System.out.println("Welcome To Sstudent management System");
			System.out.println("1.Student detail");
			System.out.println("2.Grade detail");
			System.out.println("3.Display Student detail");
			System.out.println("4.Exit\n");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Welcome to Student personal detail");
				System.out.println("Enter student name : ");
				name = sc.next();
				if (3 <= name.length()) {
					System.out.println("Enter Student City");
					add = sc.next();

					System.out.println("Enter Student age");
					age = sc.nextInt();

					if (age > 18 && age <= 22) {
						System.out.println("Enter Student Gender\n male or female\n write only small letter");
						gender = sc.next();

						if (gender.equals("male") || gender.equals("female")) {
							System.out.println("============================");

							System.out.println("Information Saved");
							System.out.println("============================");

						} else {
							System.err.println("Enter valid gender");
						}

					} else {
						System.err.println(" Enter age 18 up to 22");
					}
					
					

				} else {
					System.err.println("Name should be 3 charecter");
				}

				

			} else if (choice == 2) {

				System.out.println("Welecome to Student Grade details ");
				System.out.println("Enter Student Marks");
				marks = sc.nextDouble();
				if (marks > 0 && marks <= 100) {

					if (marks >= 90) {
						grade = 'A';
						System.out.println("You got Grade = " + grade);

					} else if (marks >= 80 && marks < 90) {
						grade = 'B';
						System.out.println("You got Grade = " + grade);

					} else if (marks >= 60 && marks < 80) {
						grade = 'C';
						System.out.println("You got Grade = " + grade);

					} else if (marks >= 45 && marks < 60) {
						grade = 'D';
						System.out.println("You got Grade = " + grade);

					} else if (marks >= 35 && marks < 45) {
						grade = 'E';
						System.out.println("You got Grade = " + grade);
					} else {
						System.err.println("Fail");
						System.out.println("You Can't get addission");
						System.out.println("|| Better luck next time ||");
						break;
					}
					System.out.println("============================");

					System.out.println("Information Saved");
					System.out.println("============================");

				} else {
					System.err.println("Enter valid Marks");
				}

			} else if (choice == 3) {
				System.out.println("============ Student Details ==================");
				System.out.println("Student name    = " + name);
				System.out.println("Student address = " + add);
				System.out.println("Student age     = " + age);
				System.out.println("Student gender  = " + gender);
				System.out.println("Student marks   = " + marks);
				System.out.println("Student Grade   = " + grade);
				System.out.println("================================================");

			} else if (choice == 4) {
				System.out.println("Thank you | Keep Learning.. | ");
				break;
			} else {
				System.err.println("Enter valid choice");
			}

		} while (true);

	}

}
