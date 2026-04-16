package com.for_loop;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		//17.Calculate factorial of a number using for loop.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		int fact=1;
		
		for (int i = 1; i <=num; i++) {
			
			fact*=i;
			
		}
		System.out.println(fact);
	}

}
