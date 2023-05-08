package AccessModifiers;

public class DemoPrivate {

	public static void main(String[] args) {
		HelloPrivate obj=new HelloPrivate();  
		 // System.out.println(obj.a); //Compile Time Error
		 // obj.show();//Compile Time Error
	}

}
