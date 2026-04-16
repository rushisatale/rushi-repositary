package Else_if;

import java.util.Scanner;

public class Grade {

	// 21.Write a program to display grade based on marks using else if

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();

		if (marks > 80) {
			System.out.println("you have got 'A' grade");

		} else if (marks > 60) {
			System.out.println("you have got 'B' grade");
			
		}else if (marks > 45) {
			System.out.println("you have got 'C' grade");
		
		}else if (marks > 35) {
			System.out.println("you have got 'D' grade");
			
		}else {
			System.out.println("You are Fail");
		}
	}

}
