package If_else;

import java.util.Scanner;

public class Zero_or_NonZero {
	
	//14 . Write a program to check if a a number is zero or non-zero
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		
		if(num==0) {
			System.out.println(" your Number is zero");
		}else {
			System.out.println("your number is non-zero");
		}
				
	
	}

}
