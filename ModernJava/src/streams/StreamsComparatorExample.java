package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentInit;

public class StreamsComparatorExample {

	static List<Student> studentList = StudentInit.getAllStudents();

	public static List<Student> sortedByName(){
		return studentList.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortedByGpa(){
		return studentList.stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {

		System.out.println("sortedByName : " + sortedByName());
		System.out.println("sortedByGpa : " + sortedByGpa());

	}

}
