package Threading;

public class ThreadCreation extends Thread {
	public void run() {
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
       ThreadCreation th= new ThreadCreation();
       try {
		th.sleep(1500);
	   } catch (InterruptedException e) {
		e.printStackTrace();
	   }
       th.start();
	}

}
