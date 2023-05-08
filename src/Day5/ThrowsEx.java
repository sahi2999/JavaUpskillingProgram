package Day5;

public class ThrowsEx {
    public static void myMethod()throws ArithmeticException,NullPointerException{
    	String s=null;
    	System.out.println(s.length());
    //	System.out.println(100/0);
    	System.out.println("Inside the MyMethod");
    }
	
	public static void main(String[] args) {

		try {
			ThrowsEx.myMethod();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception is handled");
		}
		catch(NullPointerException e1) {
			System.out.println("Null pointer Exception is handled");
		}
	}

}
