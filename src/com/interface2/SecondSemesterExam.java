package com.interface2;

public class SecondSemesterExam implements Student {

	@Override
	public double calculteMarks(double[] marks2) {
		double total = 0;

		for (int i = 0; i < marks2.length; i++) {

			total = total + marks2[i];
		}

		double percentage = (total / 500) * 100;

		return percentage;

	}

}
