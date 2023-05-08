package Java8;

import java.util.ArrayList;
import java.util.List;

public class LimitAndSkip {

	public static void main(String[] args) {
     List<String> things= new ArrayList<>();
     things.add("Pen");
     things.add("Eraser");
     things.add("Pencil");
     things.add("Sharpener");
     things.add("Marker");
     things.add("Chalk");
     things.add("Black Board");
     things.add("Duster");
     
     System.out.println("Output after appliying the Limit() Function:");
     things.stream().limit(5).forEach(System.out::println);
     
     System.out.println("\nOutput after appliying the Skip() Function:");
     things.stream().skip(5).forEach(System.out::println);
     


     
	}

}
