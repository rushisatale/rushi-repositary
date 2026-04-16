package IF_Statement;

import java.util.Scanner;

public class Negative_Num {
	
	// 2. Write a program to check if a number is negative
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number : ");
		
		int num = sc.nextInt();
		
		if(num<0) {
			
			System.out.println(num + " : is negative number");
		}
	}

}
