package Day2;

import java.util.Scanner;

public class FibonnaciSeries9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		
		System.out.println("Fibonnaci series upto "+n+":");
		for (int i = 1; i <= n; i++) {
			System.out.print(a + ",");
			c = a + b;
			a = b;
			b = c;

		}
	}
}
