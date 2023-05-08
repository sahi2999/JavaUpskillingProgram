package Java8;

interface MyInterface{
	MethodReferenceEx3 get(String st);
}


public class MethodReferenceEx3 {
	private String st;
	
	MethodReferenceEx3(String st){
		this.st=st;
		System.out.println("Inside the Constructor :"+st);
	}
	
	public static void main(String[] args) {
		MyInterface f1=(s)->new MethodReferenceEx3(s);
		f1.get("Using Lambda");
		
		MyInterface f2=MethodReferenceEx3::new;
		f1.get("Using Constructor Mapping");
	}
}
