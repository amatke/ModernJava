package streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsOfIterateGenerate {

	
	public static void of() {
		Stream.of("Dunav", "Sava", "Drina", "Morava").forEach(System.out::println);
	}
	
	public static void iterate() {
		Stream.iterate(1, x -> x*3).limit(8).forEach(System.out::println);
	}
	
	public static void generate() {
		Random random = new Random();
		Stream.generate( () -> random.nextInt(100)).limit(8).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		System.err.println("of: ");
		of();
		
		System.err.println("iterate: ");
		iterate();
		
		System.err.println("generate: ");
		generate();
	}

}
