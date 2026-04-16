package IF_Statement;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		
		// 1.Write a program to check if a number is positive

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your no : ");

		int num = sc.nextInt();

		if (num > 0) {

			System.out.println(num + ": is positive number");
		}

	}

}
