package com.for_loop;

import java.util.Scanner;

public class Count_digit {
	
	public static void main(String[] args) {
		
		//20.Count digits of a number using for loop.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int ld=0;
		int count;
		for (count=0;  num!=0; count++) {
			
			ld=num % 10;
			
			num/=10;
		}
		System.out.println("count of given number = "+count);
	}
	

}
