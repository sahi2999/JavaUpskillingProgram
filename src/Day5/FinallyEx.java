package Day5;

public class FinallyEx {

	public static void main(String[] args) {
		try {
			int a = 9 / 0;
			System.out.println("Inside the Try block");
		} catch (NullPointerException e) {
			System.out.println("Exception is handled inside the catch block");
		} finally {
			System.out.println("Finally block is always execute");

		}
	}

}
