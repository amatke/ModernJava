package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import data.Student;
import data.StudentInit;

public class PredicateAndConsumerExample {

	static List<Student> studentList = StudentInit.getAllStudents();
	static Predicate<Student> p1 = (student) -> student.getGrade() % 2 == 0;
	static Predicate<Student> p2 = (student) -> student.getGpa() > 4.5;
	static BiConsumer<String, List<String>> bi = (name, activities) -> System.out.println(" name: " + name + ", activities: " + activities);
	
	public static void main(String[] args) {

		studentList.forEach(s -> {
			if(p1.and(p2).test(s)) {
				System.out.print("grade: " + s.getGrade() + ", gpa: " + s.getGpa());
				bi.accept(s.getName(), s.getActivities());
			}
		});
	}

}
