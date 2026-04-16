package IF_Statement;

import java.util.Scanner;

public class Salary {
	
	//9. Write a program to check salary is Greater than 25,000
	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter your salary : ");
		int salary = sc.nextInt();
		
		if(salary > 25000) {
			System.out.println(salary + ": is Greater than 25000");
		}
	}
	
}
