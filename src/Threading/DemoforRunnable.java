package Threading;

class x implements Runnable{
	public void run() {
		for(int i=1;i<=6;i++) {
		System.out.println("Hii");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class y implements Runnable{
	public void run() {
		for(int i=1;i<=6;i++) {
		System.out.println("Hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

public class DemoforRunnable {
	public static void main(String[] args) {
      Runnable obj1=new x();
      Runnable obj2=new y();
      
      Thread t1=new Thread(obj1);
      Thread t2=new Thread(obj2);
      
      t1.start();
      t2.start();

	}

}
