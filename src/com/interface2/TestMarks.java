package com.interface2;

import java.util.Scanner;

public class TestMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Enter First Semester marks");
		System.out.println("2.Enter second Semester marks");
		System.out.println("Enter your option :");

		int option = sc.nextInt();
		
		double[] marks = new double[5];
		double[] marks2 = new double[5];

		if (option == 1) {
			for (int i = 0; i < marks.length; i++) {

				System.out.println("Enter marks for subject = " + (i + 1));
				int m = sc.nextInt();

				if (Student.validateMarks(m)) {

					marks[i] = m;
				} else {
					System.out.println("Enter Valid marks");
					i--;
				}

			}
			FirstSemesterExam fs = new FirstSemesterExam();

			double per = fs.calculteMarks(marks);

			System.out.println("First Semester Percentage = " + per + " % ");

		} else if (option == 2) {
			for (int i = 0; i < marks.length; i++) {

				System.out.println("Enter marks for subject = " + (i + 1));
				int m = sc.nextInt();

				if (Student.validateMarks(m)) {

					marks[i] = m;
				} else {
					System.out.println("Enter Valid marks");
					i--;
				}

			}
			SecondSemesterExam ss = new SecondSemesterExam();

			double perc = ss.calculteMarks(marks2);
			System.out.println("Second Semester Percentage = " + perc + " % ");

		}
		else {
			
			System.out.println("Enter valid option");
		}

	}

}
