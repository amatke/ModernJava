package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;
import data.Student;
import data.StudentInit;

public class PredicateStudentExample {

	static List<Student> studentList = StudentInit.getAllStudents();
	static Predicate<Student> p1 = (s) -> s.getGpa() > 4.5 && s.getGpa() < 5.0;
	static Predicate<Student> p2 = (s) -> s.getGrade() % 2 == 0;
	
	
	public static void odlicniStudent() {
		System.err.println("Odlicni studenti: ");
		studentList.forEach(s -> {
			if(p1.test(s)) {
				System.out.println(s.getName() + " " + s.getGpa());
			}
		});
	}
	
	public static void parneGodine() {
		System.err.println("Studenti parnih godina: ");
		studentList.forEach(s -> {
			if(p2.test(s)) {
				System.out.println(s.getName() + " " + s.getGrade());
			}
		});
	}
	
	public static void main(String[] args) {

		odlicniStudent();
		parneGodine();
	}

}
