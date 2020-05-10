package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {

		// Legacy Java (until Java 7)
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {	// 0  -> o1 == o2
				return o1.compareTo(o2);					// 1  -> o1 > o2
			}												// -1 -> o1 < o2
		};
		System.out.println("Comparator result for 3 and 2 is : " + comparator.compare(3, 2));
		System.out.println("Comparator result for 2 and 3 is : " + comparator.compare(2, 3));
		
		
		// Lambda Java 8
		Comparator<Integer> lambdaComparator = (Integer o1, Integer o2) -> o1.compareTo(o2);
		System.err.println("Lambda Comparator result fro 4 and 1 is : " + lambdaComparator.compare(4, 2));
		System.err.println("Lambda Comparator result fro 4 and 4 is : " + lambdaComparator.compare(4, 4));
	}

}
