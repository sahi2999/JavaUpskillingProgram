package Day2;

import java.util.Scanner;

public class ArmStrongNumber10 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Any Number: ");
     int n=sc.nextInt();
     int copy=n;
     int sum=0;
     int r;
     while(n>0) {
    	 r=n%10;
    	 sum=sum+(r*r*r);
    	 n=n/10;
    	 
     }
     if(sum==copy) {
    	 System.out.println(copy+" is an Armstrong Number");
     }
     else {
    	 System.out.println(copy+" is  not an Armstrong Number");
 
     }
	}

}
