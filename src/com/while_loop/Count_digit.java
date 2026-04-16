package com.while_loop;

import java.util.Scanner;

public class Count_digit {
	
	public static void main(String[] args) {
		
		
		//27.Count number of digits in a number using while loop.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num= sc.nextInt();
		
		int ld=0;
		int count=0;
		
		while(num!=0) {
			
			ld= num % 10;
			
			num/=10;
			count++;
		}
		System.out.println("Count of given number = "+count);
		
	}

}
