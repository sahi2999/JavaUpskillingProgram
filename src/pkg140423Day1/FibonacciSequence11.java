package pkg140423Day1;

import java.util.Scanner;

public class FibonacciSequence11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      int n=sc.nextInt();
	      
	      int i=1,a=0,b=1; 
	      System.out.println("Fibonnaci series upto "+n+":");
	      
	      while(i<=n) {
		      System.out.print(a+",");
	    	  int c=a+b;
	    	  a=b;
	    	  b=c;
	    	  i++;
	      }
	     
	}

}
