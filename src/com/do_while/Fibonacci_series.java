package com.do_while;

import java.util.Scanner;

public class Fibonacci_series {
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number :  ");
		int num=sc.nextInt();
		int first= 0;
		int second=1;
		int next=0;
		int count=0;
		
		do {
			
			System.out.print(first+" ");
			
			next= first+ second;
			
			first=second;
			second=next;
			
			count++;
			
		} while (count<=num);
		
		
	}

}
