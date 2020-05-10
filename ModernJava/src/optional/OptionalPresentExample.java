package optional;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String[] args) {

		Optional<String> optional = Optional.ofNullable("Hello World");
		
		// ifPresent()
		optional.ifPresent( (str) -> System.out.println(str) );
		
		
		// isPresent()
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
	}

}
