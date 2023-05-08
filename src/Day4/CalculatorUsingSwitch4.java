package Day4;

public class CalculatorUsingSwitch4 {
	
	enum Calculator{
		ADDITION,SUBTRACTION,MULTIPLICATION,DIVISION;
	}

	public static void main(String[] args) {
		Calculator calculate = Calculator.ADDITION;

		switch (calculate) {
		case ADDITION:
			System.out.println("Perform Addition Operation");
			break;
		case SUBTRACTION:
			System.out.println("Perform SUBTRACTION Operation");
			break;
		case MULTIPLICATION:
			System.out.println("Perform MULTIPLICATION Operation");
			break;
		case DIVISION:
			System.out.println("Perform DIVISION Operation");
			break;
		default:
			System.out.println("This operation is not possible");
			break;
       }
	}

}
