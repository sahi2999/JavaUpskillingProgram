package pkg140423Day1;

import java.util.Scanner;

public class ComparisonOfTwoNumbers3 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any 2 numbers: ");
     int a=sc.nextInt();
     int b=sc.nextInt();
     if(a>b) {
    	 System.out.println(a+" is greater than "+ b);
     }
     else if(a<b) {
    	 System.out.println(a+" is less than "+ b);
     }
     else {
    	 System.out.println(a+" is equal to "+ b);

     }
	}

}
