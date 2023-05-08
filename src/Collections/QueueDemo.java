package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
     Queue<Integer> nums=new LinkedList<>();
     nums.offer(34);
     nums.offer(67);
     nums.offer(89);
     nums.offer(78);
     nums.offer(17);
     System.out.println(nums);
     
     int a=nums.peek();
     System.out.println("Head of the queue: "+a);
     
     int del =nums.poll();
     System.out.println("Removed Element : "+del);
     System.out.println("Updated queue: "+nums);

     
     Queue<Integer> nu=new LinkedList<>();
     nu.add(89);
     System.out.println(nu);
     int d2=nu.remove();
     System.out.println(d2);

     
	}

}
