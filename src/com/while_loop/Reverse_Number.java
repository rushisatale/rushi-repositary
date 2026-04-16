package com.while_loop;

import java.util.Scanner;

public class Reverse_Number {
	
	public static void main(String[] args) {
		
		//25.Reverse a number using while loop.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("\nReverse number ....");
		
		int digit=0;
		
		while (num!=0) {
			
			digit= num % 10;//last digit
			
			System.out.print(digit);
			
			num/=10;
			
			
		}
		
	}

}
