package com.while_loop;

import java.util.Scanner;

public class Login_system {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String username= "Rushi";
		String password= "1234";
		
		
		while(true) {
			
			System.out.println("Enter your Username : ");
			String uname= sc.next();
			
			System.out.println("Enter your Password : ");
			String pwd= sc.next();
			
			if(username.equals(uname) && password.equals(pwd)) {
				
				System.out.println("Login Succesful..");
			}else {
				System.out.println("Invalid Username or password try again");
			}
		}
	}

}
