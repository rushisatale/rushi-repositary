package com.frontend;

import java.util.ArrayList;
import java.util.Scanner;

import com.controller.BookController;
import com.dao.Bookdao;
import com.entity.Book;

public class BookMain {

	public static void main(String[] args) {
//		Bookdao dao = new Bookdao();
//		dao.createTable();

		BookController controller = new BookController();

		Scanner sc = new Scanner(System.in);

		int attempt = 0;
		while (attempt <= 6) {

			System.out.println("\n=======================\n");

			System.out.println("1.Insert Book ");
			System.out.println("2.update Book");
			System.out.println("3.Get book by id");
			System.out.println("4.Get all Books");
			System.out.println("5.Delete book by id");
			System.out.println("6.Delete all Book");
			System.out.println("7.Exit");
			System.out.println("========================\n");
			System.out.println("Enter your option: ");
			int option = sc.nextInt();

			if (option == 1) {

				try {
					System.out.print("id = ");
					int id = sc.nextInt();
					System.out.print("name = ");
					String name = sc.next();
					System.out.print("price = ");
					double email = sc.nextDouble();
					System.out.print("author = ");
					String auth = sc.next();
					System.out.print("quantity = ");
					int qty = sc.nextInt();
					System.out.print("mfgDate = ");
					String mfg = sc.next();
					System.out.println("expDate = ");
					String exp = sc.next();

					Book book = new Book(id, name, email, auth, qty, mfg, exp);
					System.out.println(controller.insertBook(book));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			else if (option == 2) {

				try {

					System.out.print("id = ");
					int id = sc.nextInt();
					System.out.print("name = ");
					String name = sc.next();
					System.out.print("price = ");
					double email = sc.nextDouble();
					System.out.print("author = ");
					String auth = sc.next();
					System.out.print("quantity = ");
					int qty = sc.nextInt();
					System.out.print("mfgDate = ");
					String mfg = sc.next();
					System.out.println("expDate = ");
					String exp = sc.next();

					Book book = new Book(id, name, email, auth, qty, mfg, exp);
					System.out.println(controller.updateBook(book));

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			else if (option == 3) {

				System.out.println("Enter id which book you want :");
				int id = sc.nextInt();
				try {

				
					Book book = controller.getBook(id);
					System.out.println(book);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			else if (option == 4) {
				try {
					ArrayList<Book> books = controller.getAllBook();

					for (Book book : books) {

						System.out.println(book);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}

			else if (option == 5) {

				System.out.println("Enter id which book want to delete : ");
				int id = sc.nextInt();

				try {
					System.out.println(controller.deleteBook(id));
				} catch (Exception e) {
					System.out.println(e.getMessage());

				}
			}

			else if (option == 6) {
				try {
					System.out.println(controller.deleteAll());
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			else if (option == 7) {

				System.out.println("Thank you !");
				break;
			} else {

				System.out.println("Enter valid option....");
			}

			attempt++;
		}

	}

}
