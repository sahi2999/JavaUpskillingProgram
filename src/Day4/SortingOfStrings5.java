package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingOfStrings5 {
	public static void main(String[] args) {
		List<String> mylist = new ArrayList<>();
		mylist.add("Ant");
		mylist.add("Cat");
		mylist.add("Zebra");
		mylist.add("Ball");
		mylist.add("Ice-Cream");
		mylist.add("Apple");
		System.out.println("List before sorting : " + mylist);

		Stream<String> sortedData = mylist.stream().filter(s -> s.length() > 3).sorted();
		System.out.println("List after sorting: ");
		sortedData.forEach(System.out::println);
        
	      
	}
}
