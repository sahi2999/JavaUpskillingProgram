package Threading;

public class ThreadCreationUsingIntf implements Runnable {
	
	@Override
	public void run() {
     System.out.println("Inside run method for Runnable Interface");		
	}
	public static void main(String[] args) {
		ThreadCreationUsingIntf tc= new ThreadCreationUsingIntf();
		Thread t= new Thread(tc);
		try {
			t.sleep(1500);
		   } catch (InterruptedException e) {
			e.printStackTrace();
		   }
		t.start();

	}

	

}
