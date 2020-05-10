package optional;

import java.util.Arrays;
import java.util.Optional;

import data.Student;

public class OptionalFilterMapFlatmapExample {

	
	public static Optional<Student> filterOptional(){
		Optional<Student> studentOp = Optional.ofNullable(new Student("Mirko", "muski", 4.5, 1, Arrays.asList("Odbojka", "Kosarka", "Plivanje")));
		
		studentOp.filter( s -> s.getGender().startsWith("muski"))
			.ifPresent( student -> System.out.println(student));
		
		return studentOp;
	}
	
	
	public static Optional<Student> mapOptional(){
		Optional<Student> studentOptional = Optional.ofNullable(new Student("Mirko", "muski", 4.5, 1, Arrays.asList("Odbojka", "Kosarka", "Plivanje")));
		
		studentOptional.filter( s -> s.getGender().startsWith("muski"))
			.map(student -> student.getName());
		
		return studentOptional;
	}
	
	
	public static void main(String[] args) {

		filterOptional();
		
		System.out.println("mapOptional() " + mapOptional());
	}

}
