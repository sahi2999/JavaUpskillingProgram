package Java8;

import java.util.function.Predicate;

public class PredicateAnd {

	public static void main(String[] args) {
    Predicate<Integer> lessThanFifty=(i) -> i < 50;
    Predicate<Integer> GreaterThanTwenty=(i) -> i > 20;
    
    
    boolean result1=lessThanFifty.and(GreaterThanTwenty).test(45);
    boolean result2=lessThanFifty.and(GreaterThanTwenty).test(20);
    System.out.println("After performing And operation:");
    System.out.println(result1);
    System.out.println(result2);
    

    boolean negateResult1=lessThanFifty.and(GreaterThanTwenty).negate().test(45);
    boolean negateResult2=lessThanFifty.and(GreaterThanTwenty).negate().test(20);
    System.out.println("After performing Negate(not) operation:");
    System.out.println(negateResult1);
    System.out.println(negateResult2);
    
    



	}

}
