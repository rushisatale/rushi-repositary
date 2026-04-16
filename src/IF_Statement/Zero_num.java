package IF_Statement;

import java.util.Scanner;

public class Zero_num {
	
	// 3.Write a program to check number is zero

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		if(num==0) {
			
			System.out.println(num + " is zero number");
		}
		
	}
}
