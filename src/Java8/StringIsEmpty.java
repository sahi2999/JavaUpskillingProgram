package Java8;

import java.util.Arrays;
import java.util.List;

public class StringIsEmpty {

	public static void main(String[] args) {
		List<String> st=Arrays.asList("abc","Abstarct","","iou","Program","yut","","def","","e","Java");
		long EmptyStrings=st.stream().filter(s->s.isEmpty()).count();
		System.out.println("No of Empty Strings in the given List is "+EmptyStrings);
		
		System.out.println("Strings whose length is greater than 3 are :");
		st.stream().filter(s->s.length()>3).forEach(System.out::println);


	}

}
