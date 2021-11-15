package exceptions;

public class DivideException extends Exception {

	public void handle() {
		System.out.println("This exception can be fixed by the first number being greater than the second number.");
	}

	public void handle2() {
		System.out.println("This exception can be fixed by the first and second number being not being equal.");
	}

	public void handle3() {
		System.out.println("This exception can be fixed by either number not being equal to 0.");
	}

}
