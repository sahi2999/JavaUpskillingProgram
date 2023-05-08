package Day4;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class CustomException9 {
	public static void Validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException ("You are not eligible for voting");
		}
		else {
			System.out.println("Welcome to the Election Commission.You can vote for anyone as your wish");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age to know your voting status");
		int age=sc.nextInt();
		
		try {
			Validate(age);
		}
		catch(InvalidAgeException e) {
			System.out.println("Exception occured: "+e);
			System.out.println(e.toString());
			
		}	
		
	}

}
