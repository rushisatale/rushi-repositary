package com.do_while;

import java.util.Scanner;

public class Display_menu {
	
	public static void main(String[] args) {
		
		//37.Display menu until user chooses exit using do-while loop
		
		int iteration=1;
		boolean b=true;
		
		do {
			Scanner sc= new Scanner(System.in);
			
			System.out.println(" 1.Pizza \n 2.Burger \n 3.Vadapav \n 4.Samosa \n 5.Exit");
			System.out.println("Enter your choice :  ");
			int choice=sc.nextInt();
			
			if(choice==1) {
				System.out.println(" You Have choose Pizza");
				System.out.println(" Wait for order \n Thank you");
				
			}else if(choice==2) {
				
				System.out.println(" You Have choose Burger");
				System.out.println(" Wait for order \n Thank you");
				
			}else if(choice==3) {
				
				System.out.println(" You Have choose Vadapav");
				System.out.println(" Wait for order \n Thank you");
				
			}else if(choice==4) {
				
				System.out.println(" You Have choose Samosa");
				System.out.println(" Wait for order \n Thank you");
				
			}else if(choice==5) {
				
				System.out.println(" !Thanks for visting! ");
				b=false;
				//return;
			}else {
				System.out.println("invalid choice");
			}
			
			iteration++;
			
		}while(b);
	}

}
