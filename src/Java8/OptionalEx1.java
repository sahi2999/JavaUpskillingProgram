package Java8;

import java.util.Optional;

public class OptionalEx1 {

	public static void main(String[] args) {
      Optional<String> empty=Optional.empty();
      System.out.println(empty);
      System.out.println("isPresent: "+empty.isPresent());
      
      Optional<String> data =Optional.of("Java is a Programming Language");
      System.out.println("isPresent: "+data.isPresent());

      System.out.println("Value in the data object: "+data.get());
      if(empty.isPresent()) {
          System.out.println(empty.get());
      }
      

      System.out.println(data.filter((s)->s.equals("Java is a Programming Language")));
      System.out.println(data.filter((s)->s.equals("Java is a Programming Languag")));

      System.out.println(data.orElse("Default Value"));
      System.out.println(empty.orElse("Default Value"));
    //  System.out.println(empty.get());

	}

}
