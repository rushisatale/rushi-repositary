package com.interface2;

public interface Student {

	double calculteMarks(double marks[]);

	static boolean validateMarks(int m) {

		if (m <= 0 || m > 100) {

			return false;
		}

		return true;

	}

}
