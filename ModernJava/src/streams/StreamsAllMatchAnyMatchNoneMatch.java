package streams;

import java.util.List;

import data.Student;
import data.StudentInit;

public class StreamsAllMatchAnyMatchNoneMatch {

	static List<Student> studentList = StudentInit.getAllStudents();
	
	public static boolean allMatch() {
		return studentList.stream().allMatch(s -> s.getGpa() > 3.3);
	}
	
	public static boolean anyMatch() {
		return studentList.stream().anyMatch(s -> s.getGender().equals("muski"));
	}
	
	public static boolean noneMatch() {
		return studentList.stream().noneMatch(s -> s.getGrade() == 3);
	}
	
	public static void main(String[] args) {
		
		System.out.println("allMatch result is: " + allMatch());
		System.out.println("anyMatch result is: " + anyMatch());
		System.out.println("noneMatch result is: " + noneMatch());

	}

}
