package IF_Statement;

import java.util.Scanner;

public class Divisible_5 {
	
	//8. Write a program to check if a number is divisible by 5.
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter a num : ");
		int num = sc.nextInt();
		
		if(num % 5==0) {
			System.out.println(num + " :is divisible by 5 ");
		}
	}

}
