package Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOfIntegers6 {

	public static void main(String[] args) {
      List<Integer> mylist = new ArrayList<>();
      mylist.add(56);
      mylist.add(79);
      mylist.add(5);
      mylist.add(34);
      mylist.add(88);
      mylist.add(20);
      mylist.add(62);

	  System.out .println(mylist);

	  Stream<Integer> filteredData=mylist.stream().filter(i->i%2==0);
	  System.out .println("Even numbers are");

	  filteredData.forEach(System.out::println);

	}

}
