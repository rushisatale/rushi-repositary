package com.interface2;


public class FirstSemesterExam implements Student {

	@Override
	public double calculteMarks(double[] marks) {

		double total = 0;

		for (int i = 0; i < marks.length; i++) {

			total = total + marks[i];
		}

		double percentage = (total / 500) * 100;

		return percentage;

	}

}
