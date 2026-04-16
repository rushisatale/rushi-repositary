package IF_Statement;

import java.util.Scanner;

public class Temprature {
	
	//10.Write a program to check if temperature is high
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your current Temprature : ");
		int temp= sc.nextInt();
		
		if(temp > 37) {
			System.out.println("Your temprature is high");
		}
	}

}
