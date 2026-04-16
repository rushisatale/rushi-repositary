package com.while_loop;

public class Sum_of_1to10 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		while (num <= 10) {

			sum = sum + num;
			num++;
		}
		System.out.println(sum);
	}

}
