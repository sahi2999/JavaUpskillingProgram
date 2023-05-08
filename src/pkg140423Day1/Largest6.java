package pkg140423Day1;

import java.util.Scanner;

public class Largest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter any 3 numbers: ");
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c=sc.nextInt();
	     int largest=0;
	     if(a>b) {
	    	 if(a>c){
	    		 largest=a;
	    	 }
	    	 else {
	    		 largest=c;
	    	 }
	     }
	     else  {
	    	 if(b>c) {
	    		 largest=b;
	    	 }
	    	 else {
	    		 largest=c;
	    	 }
	     }
	     
	     System.out.println("Largest among the given 3 numbers is "+largest);
	}

}
