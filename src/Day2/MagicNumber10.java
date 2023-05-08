package Day2;

import java.util.Scanner;

public class MagicNumber10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int n = sc.nextInt();
		int num = n;

		int sum = 0;
		int r;
		while (n > 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		
		if (sum == 1) {
			System.out.println(num + " is a Magic Number");
		} else {
			System.out.println(num + " is not a Magic Number");

		}

	}

}
