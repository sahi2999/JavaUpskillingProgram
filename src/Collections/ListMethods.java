package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		List<Integer> list =new ArrayList<>();
		
		for(int i=10;i<=100;i=i+10) {
			list.add(i);
		}
		System.out.println("List : "+list);
		
		list.add(2,100);
		System.out.println("List after Insertion : "+list);
		
		list.set(3, 200);
		System.out.println("List after Replacement : "+list);
      
		List<Integer> secondlist= new ArrayList<>();
		secondlist.add(111);
		secondlist.add(222);
		secondlist.add(333);
		System.out.println("Second List : "+secondlist);
		
		list.addAll(secondlist);
		System.out.println("List After AddAll without index : "+list);
		
		list.addAll(4, secondlist);
		System.out.println("List After AddAll: "+list);
		
		if(list.contains(222)) {
			System.out.println("List contains the value");
		}
		else {
			System.out.println("List does not have this  value");

		}
       
		System.out.println(list.get(5));


		System.out.println("Elements in the List are : ");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));

		}

       list.remove(3);
	   System.out.println("List after Removal :"+list);



	}

}
