package Day5;

public class ThrowEx1 {
	public static void validateBalance(int balance) {
		if(balance<500) {
			throw new ArithmeticException("You have to maintain 500 minimum balance");
		}
		else {
			System.out.println("Balance is sufficient");
		}
	}

	public static void main(String[] args) {
		ThrowEx1.validateBalance(230);
}

}
