package streams;


import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentInit;

public class StreamsMapExample {

	static List<Student> studentList = StudentInit.getAllStudents();
	
	public static List<String> studentNamesList(){
		
		return studentList.stream()
			.map(Student::getName)
			.collect(Collectors.toList());
	}
	
	public static Map<String, Double> nameGpaMap(){
		
		return studentList.stream()
			.collect(Collectors.toMap(Student::getName, Student::getGpa));
	}
	
	
	public static Set<String> studentNamesSet(){
		
		return studentList.stream()
			.map(Student::getName)
			.map(String::toUpperCase)
			.collect(Collectors.toSet());
	}
	
	
	public static void main(String[] args) {
		
		studentNamesList().forEach(System.out::println);
		
		studentNamesSet().forEach(System.out::println);
		
		nameGpaMap().forEach( (name, gpa) -> System.out.println(name + " - " + gpa));
	}

}
