package com.do_while;

import java.util.Scanner;

public class Multipilcation_table {
	
	public static void main(String[] args) {
		
		//35.Print multiplication table using do-while loop.
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int mul=1;
		
		do {
			
			System.out.println(num+ " * "+mul+" = "+(num*mul));
			mul++;
			
		}while(mul<=10);
	}

}
