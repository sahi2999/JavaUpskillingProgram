package pkg140423Day1;

import java.util.Scanner;

public class StringReversalUsingForLoop13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the input  String :");
	      String s=sc.nextLine();
	      
	      
	      for(int i=s.length()-1;i>=0;i--) {
	    	  System.out.print(s.charAt(i));
	      }
	}

}
