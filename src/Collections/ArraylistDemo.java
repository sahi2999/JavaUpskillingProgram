package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<>();
		mylist.add("abc");
		mylist.add("def");
		mylist.add("xyz");
		System.out.println(mylist);

		ListIterator<String> itr = mylist.listIterator();
		System.out.println("Forward Iteration: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("Backward Iteration: ");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());

		}

	}

}
