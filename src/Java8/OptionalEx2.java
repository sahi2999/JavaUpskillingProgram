package Java8;

import java.util.Optional;

public class OptionalEx2 {

	public static void main(String[] args) {
      String[] array= new String[10];
      array[4]="Optional is a container object";
      
      Optional<String> checkNull=Optional.ofNullable(array[4]);
      checkNull.ifPresent(System.out::println);

      if(checkNull.isPresent()) {
    	  String uppercase=array[4].toUpperCase();
          System.out.println(uppercase);
      }
      
      Optional<String> checkNull2=Optional.ofNullable(array[9]);
      checkNull2.ifPresent(System.out::println);
      System.out.println(checkNull2);

	}

}
