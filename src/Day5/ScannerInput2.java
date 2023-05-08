package Day5;

import java.util.Scanner;

public class ScannerInput2 {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the Integer Value");
     int i= sc.nextInt();
     System.out.println("Integer: "+i);
     
     System.out.println("Enter the String Value");
     sc.nextLine();
     String s= sc.nextLine();
     System.out.println("String: "+s);
	}

}
