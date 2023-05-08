package Day4;

public class DivideByZero7 {

	public static void main(String[] args) {
		try {
			int a=5;
			int b=0;
			int res=a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by Zero is not possible");
			System.out.println(e);
			System.out.println(e.getMessage());
			

			//e.printStackTrace();
			//System.out.println(e.toString());
		}

	}

}
