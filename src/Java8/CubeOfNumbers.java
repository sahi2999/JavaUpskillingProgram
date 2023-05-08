package Java8;
import java.util.List;

public class CubeOfNumbers {
	
	public static void cube(List<Integer> nums) {
		nums.stream().map(x -> x * x * x).forEach(x -> System.out.print(x + ","));

		System.out.println("\n\nAfter using Distinct() Function:");
		nums.stream().map(x -> x * x * x).distinct().forEach(x -> System.out.print(x + ","));

		System.out.println("\n\nAfter using Sorted() Function:");
		nums.stream().map(x -> x * x * x).distinct().sorted().forEach(x -> System.out.print(x + ","));

		System.out.println("\n\nAfter using Filter() Function:");
		nums.stream().map(x -> x * x * x).distinct().sorted().filter(x -> x > 1000)
				.forEach(x -> System.out.print(x + ","));
		
	}
	public static void main(String[] args) {
		List<Integer> nums = List.of(4, 5, 17, 10, 7, 5, 8, 7,12);
		CubeOfNumbers.cube(nums);
	}

}
