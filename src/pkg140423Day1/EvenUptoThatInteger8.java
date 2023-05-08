package pkg140423Day1;

import java.util.Scanner;

public class EvenUptoThatInteger8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      int n=sc.nextInt();
	      System.out.println("Even numbers from 2 to"+n+" :");
	      for(int i=2;i<=n;i++) {
	    	  if(i % 2 == 0) {
	    		  System.out.println(i);
	    	  }
	      }
	}

}
