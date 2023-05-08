package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator5 {

	public static void main(String[] args) {
     
		Comparator<String> comp= new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length()>s2.length()) {
					return 1;
				}
				else {
					return -1;

				}
			}
			
		};
		
		
		
		List<String> mylist = new ArrayList<>();
		mylist.add("Aeroplane");
		mylist.add("Cat");
		mylist.add("Zebra");
		mylist.add("Ball");
		mylist.add("Ice-Cream");
		mylist.add("Apple");
		System.out.println("List before sorting : " + mylist);
		
		Collections.sort(mylist,comp);
		System.out.println("List after sorting : " + mylist);

		
	}

}
