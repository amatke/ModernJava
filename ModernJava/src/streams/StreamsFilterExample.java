package streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentInit;

public class StreamsFilterExample {

	static List<Student> studentList = StudentInit.getAllStudents();

	public static List<Student> filterStudentsByGender(){
		return studentList.stream()
				.filter(s -> s.getGender().equals("zenski"))
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
	
		System.out.println("filterStudentsByGender : ");
		
		filterStudentsByGender().forEach(System.out::println);
	
	}

}
