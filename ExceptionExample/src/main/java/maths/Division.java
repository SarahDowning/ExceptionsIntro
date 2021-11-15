package maths;

import exceptions.DivideException;

public class Division {

	public String division(int num1, int num2) throws DivideException {

		if (num1 < num2) {
			DivideException d = new DivideException();
			throw d;
		} else if (num1 == num2) {
			DivideException d2 = new DivideException();
			throw d2;
		} else if (num1 == 0 || num2 == 0) {
			DivideException d3 = new DivideException();
			throw d3;
		} else {
			return "Please check you have entered appropriate values";
		} 
		
	}
}
