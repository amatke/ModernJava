package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxValue {

	static List<Integer> nummbers = Arrays.asList(10,1,3,5,7,-2);

	public static Integer minValue() {
		return nummbers.stream()
				.reduce(10000, (a,b) -> a<b ? a:b );
	}
	
	public static Integer maxValue() {
		return nummbers.stream()
				.reduce(-10000, (a,b) -> a>b ? a:b );
	}
	
	public static Optional<Integer> minValueOptional() {
		return nummbers.stream()
				.reduce((a,b) -> a<b ? a:b );
	}
	
	public static Optional<Integer> maxValueOptional() {
		return nummbers.stream()
				.reduce((a,b) -> a>b ? a:b );
	}
	
	public static void main(String[] args) {

		System.out.println("minValue is: " + minValue());
		System.out.println("maxValue is: " + maxValue());
		
		if(minValueOptional().isPresent()) {
			System.out.println("minValueOptional : " + minValueOptional().get());
		} 
		
		if(maxValueOptional().isPresent()) {
			System.out.println("maxValueOptional : " + maxValueOptional().get());
		} 
	}

}
