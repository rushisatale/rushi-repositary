package com.for_loop;

import java.util.Scanner;

public class Multiplication_Table {
	
	public static void main(String[] args) {
		
		//15.Print multiplication table of a given number using for loop.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num= sc.nextInt();
		
		for (int i = 1; i <=10; i++) {
			System.out.println(num+" * "+i+ " = "+(num*i));
			
		}
	}

}
