package streams;

import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentInit;

public class StreamsFindFirstFindAny {

	static List<Student> studentList = StudentInit.getAllStudents();
	
	public static Optional<Student> findFirst() {
		return studentList.stream().filter(s -> s.getGpa() >=4.5).findFirst();
	}
	
	public static Optional<Student> findAny() {
		return studentList.stream().filter(s -> s.getGpa() >=4.5).findFirst();
	}
	
	public static void main(String[] args) {
		
		
		
		if (findAny().isPresent()) {
			System.out.println("findAny result is: " + findAny().get());
		}

		if (findFirst().isPresent()) {
			System.out.println("findFirst result is: " + findFirst().get());
		}
	}

}
