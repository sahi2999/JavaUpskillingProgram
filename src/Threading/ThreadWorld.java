package Threading;

public class ThreadWorld {
	
	public static void main(String[] args) {
     Thread t= new Thread("Welcome to Threading!");
     t.start();
     String s=t.getName();
     System.out.println(s);
	}

}
