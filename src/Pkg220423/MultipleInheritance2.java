package Pkg220423;

interface A{
	void show();
}

interface B{
	void config();
}

interface C extends B,A{
	void run();
}

class Alphabets implements C{
	
	public void config() {
		System.out.println("Inside Config method");
	}


	public void show() {
		System.out.println("Inside Show method");

	}
	
	public void run() {
		System.out.println("Inside run method");

	}


	
	
}

public class MultipleInheritance2 {

	public static void main(String[] args) {
		Alphabets obj=new Alphabets();
		obj.config();
		obj.show();
		obj.run();

	}

}
