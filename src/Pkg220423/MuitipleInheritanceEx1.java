package Pkg220423;

interface Display {
    void print();
}

interface Show {
    void print();
}


public class MuitipleInheritanceEx1 implements Display, Show {
	@Override
	public void print() {
		System.out.println("Hello Java!It is about Multiple Inheritance.");
	}

	public static void main(String[] args) {
		MuitipleInheritanceEx1 t = new MuitipleInheritanceEx1();
		t.print();

	}
}