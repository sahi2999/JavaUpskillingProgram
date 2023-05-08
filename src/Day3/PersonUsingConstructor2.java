package Day3;

public class PersonUsingConstructor2 {
	private int age;
	private String name;
	
	public PersonUsingConstructor2() {

		age = 12;
		name = "Satya";
	}


	public PersonUsingConstructor2(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}
