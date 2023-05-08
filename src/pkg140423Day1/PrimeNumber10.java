package pkg140423Day1;

import java.util.Scanner;

public class PrimeNumber10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      int n=sc.nextInt();
	      int c=0;
	      int i=1;
	     
	    	  while(i<=n) {
	    		 if(n%i==0) {
	    			 c++;
	    		   }
	    		   i++;
	    	  }
	    	  
	    	  if(c==2) {
			      System.out.println(n+" is a prime number");
	    	  }
	    	  else {
			      System.out.println(n+" is not a prime number");
	    	  }
	    
	}
}
