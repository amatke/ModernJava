package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsSkipAndLimit {

	static List<Integer> nummbers = Arrays.asList(10,1,3,5,7,-2);

	public static Optional<Integer> skipStreams() {
		return nummbers.stream().skip(3).reduce( (a,b) -> a+b);
	}
	
	public static Optional<Integer> limitStreams() {
		return nummbers.stream().limit(3).reduce( (a,b) -> a+b);
	}
	
	
	public static void main(String[] args) {
		
		if(skipStreams().isPresent()) {
			System.out.println("skipStreams result is: " + skipStreams().get());
		}
		
		if(limitStreams().isPresent()) {
			System.out.println("limitStreams result is: " + limitStreams().get());
		}
	}

}
