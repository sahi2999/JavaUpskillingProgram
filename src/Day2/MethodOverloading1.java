package Day2;

public class MethodOverloading1 {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
      MethodOverloading1 ca = new MethodOverloading1();
      ca.add(24,16);
      ca.add(14,36, 20);
	}

}
