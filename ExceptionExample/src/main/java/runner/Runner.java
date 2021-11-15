package runner;

import exceptions.DivideException;
import maths.Division;

public class Runner {

	public static void main(String[] args) {

		try {
			Division d = new Division();
			d.division(3, 6);
		} catch (DivideException e) {
			e.handle();
		}

		try {
			Division d2 = new Division();
			d2.division(4, 4);
		} catch (DivideException e2) {
			e2.handle2();
		}

		try {
			Division d3 = new Division();
			d3.division(3, 0);
		} catch (DivideException e3) {
			e3.handle3();
		}
	}

}
