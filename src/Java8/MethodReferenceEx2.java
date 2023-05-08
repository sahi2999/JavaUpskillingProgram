package Java8;

interface Multiply{
	public void product(int i,int j);
}

public class MethodReferenceEx2 {
	public static void product123(int i,int j) {
		System.out.println("Multiplication of "+i+" and "+j+" is "+(i*j));
	}
	
	public static void main(String[] args) {
     Multiply m=(i,j)->System.out.println("Product of "+i+" and "+j+" is "+(i*j));
     m.product(20, 6);
     
     Multiply p=MethodReferenceEx2::product123;
     p.product(20, 6);

	}

}
