package Java8;

interface Hello{
	 public void say(String name);
}

public class MethodReferenceEx1 {
    public void saySomething(String name) {
    	System.out.println(name);
    }
	
	public static void main(String[] args) {
		Hello h=(name)-> System.out.println("Message is :"+name);
		h.say("Hello Java");
		
		MethodReferenceEx1 mr= new MethodReferenceEx1();
		Hello f=mr::saySomething;
		f.say("Hello Java");

				

	}

}
