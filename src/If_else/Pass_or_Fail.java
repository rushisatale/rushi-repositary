package If_else;

import java.util.Scanner;

public class Pass_or_Fail {
	
	//7.Write a program to check if marks are pass or fail
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks :");
		
		int marks= sc.nextInt();
		
		if(marks > 35) {
			System.out.println("you are passed");
		}else
		{
			System.out.println("you are failed");
		}
	}

}
