package com.do_while;

import java.util.Scanner;

public class Count_digit {

	public static void main(String[] args) {

		// 39.Count digits of a number using do-while loop.

		int ld = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();

		do {

			ld = num % 10;
			num /= 10;
			count++;

		} while (num != 0);
		
		System.out.println("Count of given Number = " + count);
	}

}
