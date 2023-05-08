package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
    List<Integer> list =Arrays.asList(10,15,8,49,25,98,98,32,15);
    list.stream().sorted().forEach(System.out::println);
	}

}
