package optional;

import java.util.Optional;

import data.Student;

public class OptionalOrElseExample {

	
	public static String optionalOrElse(){
		Optional<Student> optionalStudent = Optional.ofNullable(null);
		
	    return optionalStudent.map(Student::getName).orElse("Nema studenta!");
	}
	
	public static String optionalOrElseGet(){
		Optional<Student> optionalStudent = Optional.ofNullable(null);
		
	    return optionalStudent.map(Student::getName).orElseGet( () -> "Nema studenta!" );
	}
	
	public static String optionalOrElseThrow(){
		Optional<Student> optionalStudent = Optional.ofNullable(null);
		
	    return optionalStudent.map(Student::getName).orElseThrow( () -> new RuntimeException("Nema studenta!"));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("optionalOrElse() : " + optionalOrElse());
		System.out.println("optionalOrElseGet() : " + optionalOrElseGet());
		System.out.println("optionalOrElseThrow() : " + optionalOrElseThrow());
	}

}
