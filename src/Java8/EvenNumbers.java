package Java8;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3, 4, 90, 78, 56, 24, 1);
		System.out.println("Even numbers in the given list: ");
		nums.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
	}

}
