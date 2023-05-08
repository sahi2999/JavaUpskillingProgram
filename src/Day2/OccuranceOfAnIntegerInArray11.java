package Day2;

import java.util.Scanner;

public class OccuranceOfAnIntegerInArray11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] a= {1,2,8,1,4,8,8};
		System.out.println("Enter an Integer to get the occurence in the Array :");
		int n=sc.nextInt();
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				count++;
			}
		}
		System.out.println("Number of occurences for the integer "+n+" in the Array :"+count);


	}

}
