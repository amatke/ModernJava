package numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	static	List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

	public static int sumOfNumbers() {
		return integerList.stream()
				.reduce(0, (a,b) -> a+b);
	}
	
	public static int intStreamSumOfNumbers() {
		return IntStream.rangeClosed(1, 6).sum();  // ukljucuje 6
	}
	
	public static int intStreamSumOfNumbers2() {
		return IntStream.range(1, 6).sum();			//bez sumiranje 6
	}
	
	public static void main(String[] args) {

		System.out.println("Suma n brojeva : " + sumOfNumbers());
		
		System.out.println("Suma n brojeva intStream : " + intStreamSumOfNumbers());

		System.out.println("Suma n brojeva intStreamSumOfNumbers2 : " + intStreamSumOfNumbers2());

	}

}
