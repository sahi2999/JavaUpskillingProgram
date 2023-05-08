package Day5;


import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number:");

		try (Scanner sc = new Scanner(System.in)) {
			num = sc.nextInt();
			System.out.println(num > 0  ? "Positive number" : "Negative number");
		}
		catch (Exception e) {
			System.out.println("Please provide correct number");
		}

}
			
}


