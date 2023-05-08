package pkg140423Day1;

import java.util.Scanner;

public class PositiveOrNegative5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      int a=sc.nextInt();
	      if(a>0) {
		      System.out.println(a+" is positive number"); 
	      }
	      else if(a<0) {
		      System.out.println(a+" is negative number"); 
	      }
	      else if(a==0) {
		      System.out.println("a is Zero "); 
	      }
	      
	}

}
