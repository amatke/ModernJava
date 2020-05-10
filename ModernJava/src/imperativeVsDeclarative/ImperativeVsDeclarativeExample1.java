package imperativeVsDeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

	public static void main(String[] args) {

		// imperativni stil programiranja -> kako programiram
		// nema podrsku za multithreading
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Iterativni stil - sum = " + sum);
		
		
		
		// deklarativni stil programiranja -> sta programiram?
		int sum1 = IntStream.rangeClosed(0, 100)
				//.parallel()   						// .parallel() se dodaje za za multithreading okruzenje
				.sum();
		System.out.println("Deklarativni stil - sum1 = " + sum1);
	}

}
