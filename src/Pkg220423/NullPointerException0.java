package Pkg220423;

public class NullPointerException0 {

	public static void main(String[] args) {
		String s=null;
		try {
		
			System.out.println("String s length is "+s.length());
		}
		catch(NullPointerException e) {
			System.out.println("String Value should not be null ");
			System.out.println(e);
			
		}

	}

}
