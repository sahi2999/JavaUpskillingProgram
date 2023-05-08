package Day3;

public class TestClass2 {

	public static void main(String[] args) {
		PersonUsingConstructor2 p1 = new PersonUsingConstructor2();
		PersonUsingConstructor2 p2 = new PersonUsingConstructor2(20, "Sai");

		System.out.println("Using Default Constructor: ");
		System.out.println(p1.getName() + ":" + p1.getAge());
		System.out.println("Using Parameterized Constructor: ");
		System.out.println(p2.getName() + ":" + p2.getAge());
	}

}
