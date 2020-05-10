package functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;
	
	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
	
	public static void main(String[] args) {

		System.out.println("10 * 5 = " + binaryOperator.apply(10, 5));
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Resuslts of max (2, 7) is " + maxBy.apply(2, 7));			//static metoda
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("Resuslts of min (2, 7) is " + minBy.apply(2, 7));			//static metoda
		
	}

}
