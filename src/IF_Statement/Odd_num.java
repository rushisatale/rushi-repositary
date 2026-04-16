package IF_Statement;

import java.util.Scanner;

public class Odd_num {
	
//	6. Write a program to check number is Odd
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		if(num % 2!=0) {
			System.out.println(num+" : is odd number");
		}
	}

}
