package optional;

import java.util.Optional;

public class OptionalEmptyOfNullableOf {

	
	public static Optional<String> empty() {
		return Optional.empty();
	}
	
	public static Optional<String> ofNullable() {
		return Optional.ofNullable("Hello World!");
	}
	
	public static Optional<String> of() {
		return Optional.of("Must not be null!");
	}
	
	public static void main(String[] args) {
		
		System.out.println("empty : " + empty());
		System.out.println("ofNullable : " + ofNullable() + " , ofNullable.get() -> " + ofNullable().get());
		System.out.println("of : " + of() + " , of.get() -> " + of().get());
	}

}
