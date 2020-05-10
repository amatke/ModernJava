package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> p1 = (num) -> num % 2 == 0;
	static Predicate<Integer> p2 = (num) -> num % 5 == 0;
	
	public static void divisibleBy2and5(Integer number) {
		System.out.println("divisibleBy2and5(" + number + ") : " + p1.and(p2).test(number));
	}
	
	
	public static void divisibleBy2or5(Integer number) {
		System.out.println("divisibleBy2or5(" + number + ") : " + p1.or(p2).test(number));
	}
	
	public static void negate(Integer number) {
		System.out.println("negate(" + number + ") : " + p1.negate().test(number));
	}

	public static void main(String[] args) {
		
		System.out.println("Predicate result of 10 % 2 == 0 is: " + p1.test(10));
		
		divisibleBy2and5(10);
		divisibleBy2and5(12);
		divisibleBy2and5(15);
		divisibleBy2and5(20);		
		
		divisibleBy2or5(12);
		divisibleBy2or5(17);
		divisibleBy2or5(5);
		
		negate(10);
		negate(5);
		negate(4);
		
	}

}
