package functionalInterfaces;

import java.util.List;
import java.util.function.BiPredicate;

import data.Student;
import data.StudentInit;

public class BiPredicateExample {

	static List<Student> studentList = StudentInit.getAllStudents();

	static BiPredicate<Integer, Double> bp = (grade, gpa) -> grade%2==0 && gpa>4.5;
	
	public static void main(String[] args) {

		studentList.forEach(s -> {
			if(bp.test(s.getGrade(), s.getGpa())) {
				System.out.println("grade: " + s.getGrade() + ", gpa: " + s.getGpa() + ", name: " + s.getName());
			}
		});
	}

}
