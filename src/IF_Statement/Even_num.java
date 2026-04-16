package IF_Statement;

import java.util.Scanner;

public class Even_num {

	// 5. Write a program to check number is even

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		if(num % 2==0) {
			
			System.out.println(num+ ": is Even number");
		}
	}

}
