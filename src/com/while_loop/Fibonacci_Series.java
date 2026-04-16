package com.while_loop;

import java.util.Scanner;

public class Fibonacci_Series {
	
	public static void main(String[] args) {
		
		//29.Print Fibonacci series up to N terms using while loop.
		// 0 1 1 2 3 5 8.....
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N terms");
		int num=sc.nextInt();
		
		int counter=0;
		int first=0;
		int second=1;
		int sum=0;
		
		System.out.println("Fibonacci series: ");
		while(counter<=num) {
			
			System.out.print(first+" ");
			
			sum=first+ second;
			
			first=second;
			second=sum;
				
			counter++;
		}
		
	}

}
