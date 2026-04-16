package com.exceptionHandling.Throw;

import java.util.Scanner;

public class Balance {

	void withdraw() {

		double balance = 100.0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount for withdraw : ");
		double amount = sc.nextDouble();

		if (amount > balance) {

			throw new InsufficientBalanceException("Insufficeint balance");
		} else {

			System.out.println("Withdraw Succesfull");
		}
	}

	public static void main(String[] args) {

		Balance b = new Balance();

		try {
			b.withdraw();
		} catch (InsufficientBalanceException i) {
			System.out.println(i.getMessage());
		}

	}

}
