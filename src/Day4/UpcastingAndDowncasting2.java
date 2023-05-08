package Day4;

class Parent {
	String name;

	public void message() {
		System.out.println("Inside the Parent class");
	}
}

class Child extends Parent {
	int id;

	public void message() {
		System.out.println("Inside the Child class");
	}
	
	public void display() {
		System.out.println("This display  method can be accessed only through Downcasting ");

	}

}



public class UpcastingAndDowncasting2 {

	public static void main(String[] args) {
		Parent p=new Child();
		p.name="Computer";
		
		System.out.println(p.name);
		p.message();
		
		
		Child c=(Child)p;
		c.id=10;
		
		System.out.println(c.id);
		System.out.println(c.name);
		c.message();
		c.display();
		
		

		
		

	}

}
