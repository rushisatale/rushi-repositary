package IF_Statement;

import java.util.Scanner;

public class Eligible_For_vote {
	
	//4.Write a program to check if a person is eligible for vote
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("You can Vote");
		}
	}

}
