package pkg140423Day1;

import java.util.Scanner;

public class PrintUptoThatInteger7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      int n=sc.nextInt();
	      System.out.println("Number from 1 to "+n+":");
	      for(int i=1;i<=n;i++) {
	    	  System.out.println(i);
	      }
	}
}
