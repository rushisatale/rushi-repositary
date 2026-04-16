package com.nested_for;

public class Pattern_4 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (char c = 65; c <= 69; c++) {

				if (i == 1 && c == 67) {
					System.out.print("4 ");

				} else if (i == 3) {
					System.out.print("* ");
				} else if (i == 5 && c == 67) {
					System.out.print("4 ");
				} else {

					System.out.print((char) c + " ");

				}
			}
			System.out.println();
		}
	}

}
