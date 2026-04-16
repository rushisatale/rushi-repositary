package com.nested_while;

import java.util.Scanner;

public class Restorant {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Pizza (RS.400)");
		System.out.println("2.Burger (RS.250)");
		System.out.println("3.VadaPav (RS.30)");
		System.out.println("4.MisalPav (RS.100)");
		System.out.println("5. Exit");
		
	
		String food;
		
		while(true) {
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			if(choice == 1) {
				food="Pizza";
				System.out.println("How many pizza you want?");
				int quantity = sc.nextInt();
				
				double total= 400 * quantity;
				
				if(total >= 4000) {
					
					double discount = total * 0.10;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

				}
				else if(total >= 2000 && total <=4000) {
					
					double discount = total * 0.05;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

					
				}
				else if(total >=1000 && total <= 2000) {
					double discount = total * 0.02;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+ food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

					
					
				}
				else {
					System.out.println("No discount");
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+ food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

				}
			}
			
			else if (choice ==2) {
				food="Burger";
				System.out.println("How many Burger you want?");
				int quantity = sc.nextInt();
				
				double total= 250 * quantity;
				
				if(total >= 4000) {
					
					double discount = total * 0.10;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

				}
				else if(total >= 2000 && total <=4000) {
					
					double discount = total * 0.05;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

					
				}
				else if(total >=1000 && total <= 2000) {
					double discount = total * 0.02;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+ food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

					
					
				}
				else {
					System.out.println("No discount");
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+ food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

				}
			
			
		}
			else if (choice == 3) {
				food="VadaPav";
				System.out.println("How many VadaPav you want?");
				int quantity = sc.nextInt();
				
				double total= 30 * quantity;
				
				if(total >= 300) {
					
					double discount = total * 0.10;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

				}
				else if(total >= 250 && total <=300) {
					
					double discount = total * 0.05;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

					
				}
				else if(total >=100 && total <= 250) {
					double discount = total * 0.02;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+ food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

					
					
				}
				else {
					System.out.println("No discount");
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+ food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

				}
			}
			else if(choice==4) {
				food="MisalPav";
				System.out.println("How many MisalPav you want?");
				int quantity = sc.nextInt();
				
				double total= 100 * quantity;
				
				if(total >= 1000) {
					
					double discount = total * 0.10;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

				}
				else if(total >= 700 && total <=1000) {
					
					double discount = total * 0.05;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

					
				}
				else if(total >=400 && total <= 700) {
					double discount = total * 0.02;
					total-=discount;
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+ food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("Discount = "+ discount);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

					
					
				}else {
					System.out.println("No discount");
					System.out.println("===Final receipt===");
					System.out.println("Ordered food = "+ food);
					System.out.println("Quantity = "+ quantity);
					System.out.println("total price = "+ total);
					System.out.println("=======================");

				}
			}
			else if (choice==5) {
				System.out.println("Thanks for ordering Food Good Bye....");
				break;
			}else {
				System.err.println("Invalid choice....");
			}
			
		}

	}

}
