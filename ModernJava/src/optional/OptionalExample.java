package optional;

import java.util.Arrays;
import java.util.Optional;

import data.Student;

public class OptionalExample {

	public static String getStudentName() {
		//Student student = new Student("Mirko", "muski", 1, 4.5, Arrays.asList("Odbojka", "Kosarka", "Plivanje"));
		Student student = null;
		
		if (student !=null) {
			return student.getName();
		}
		return null;
	}
	
	public static Optional<String> getStudentNameOptional(){
		//Optional<Student> student = Optional.ofNullable( new Student ("Mirko", "muski", 1, 4.5, Arrays.asList("Odbojka", "Kosarka", "Plivanje")));
		Optional<Student> student = Optional.ofNullable(null);
		
		if(student.isPresent()) {
			return student.map(Student::getName);
		}
		
		return Optional.empty(); // ovo je zamena za null
	}
	
	public static void main(String[] args) {
	
		String studentName = getStudentName();
		if(studentName!=null) {
			System.out.println(studentName);
		}else {
			System.err.println("Nema imena - student je null.");
		}
		
		
		Optional<String> studentNameOpt = getStudentNameOptional();
		if(studentNameOpt.isPresent()) {
			System.out.println("Optional: " + studentNameOpt.get());
		} else {
			System.err.println("Optional: Student is null.");
		}

	}

}
