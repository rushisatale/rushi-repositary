package com.Frontend;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import com.controller.UserController;
import com.dao.Userdao;
import com.entity.User;

public class UserMain {
	public static void main(String[] args) {

//		Userdao dao = new Userdao();
//		
//		dao.createTable();

		UserController controller = new UserController();

		Scanner sc = new Scanner(System.in);
		int attempt = 0;

		while (attempt <= 6) {

			System.out.println("\n=======================\n");

			System.out.println("1.Insert User ");
			System.out.println("2.update User");
			System.out.println("3.Delete one User");
			System.out.println("4.Delete all User");
			System.out.println("5.Get user by name");
			System.out.println("6.Get all User");
			System.out.println("7.Exit");
			System.out.println("========================\n");
			System.out.println("Enter your option: ");
			int option = sc.nextInt();

			if (option == 1) {
				try {
					System.out.print("username = ");
					String un = sc.next();
					System.out.print("password = ");
					String pw = sc.next();
					System.out.print("email = ");
					String email = sc.next();
					System.out.print("Dob = ");
					String dob = sc.next();
					System.out.print("mobileNo = ");
					String mob = sc.next();
					System.out.print("city = ");
					String city = sc.next();
					System.out.println("age = ");
					int age = sc.nextInt();

					User user = new User(un, pw, email, dob, mob, age, city);
					String msg = controller.insertTable(user);
					System.out.println(msg);
				} catch (Exception e) {

					System.out.println(e.getMessage());
				}

			} else if (option == 2) {
				System.out.print("username = ");
				String un = sc.next();
				System.out.print("password = ");
				String pw = sc.next();
				System.out.print("email = ");
				String email = sc.next();
				System.out.print("Dob = ");
				String dob = sc.next();
				System.out.print("mobileNo = ");
				String mob = sc.next();
				System.out.print("city = ");
				String city = sc.next();
				System.out.println("age = ");
				int age = sc.nextInt();

				User user = new User(un, pw, email, dob, mob, age, city);
				try {
					String msg = controller.updateUser(user);
					System.out.println(msg);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			else if (option == 3) {

				System.out.println("Enter name which user want delete :");
				String name = sc.next();
				try {
					System.out.println(controller.deleteUser(name));
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}

			else if (option == 4) {
				try {
					String msg = controller.deleteAll();

					System.out.println(msg);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			else if (option == 5) {

				System.out.println("Enter name which user want get :");
				String name = sc.next();
				try {
					System.out.println(controller.getUser(name));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			else if (option == 6) {

				try {
					ArrayList<User> allUser = controller.getAllUser();

					for (User user : allUser) {
						System.out.println(user);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (option == 7) {

				System.out.println("Thank you!");
				break;
			}

			else {

				System.out.println("Enter valid option....");
			}

			attempt++;
		}

	}

}
