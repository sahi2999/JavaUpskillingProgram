package Java8;

import java.util.function.Predicate;

public class GreaterThanTwenty {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> (i > 20);

		System.out.println(p.test(9));
		System.out.println(p.test(78));
		System.out.println(p.test(23));
		System.out.println(p.test(20));

	}

}
