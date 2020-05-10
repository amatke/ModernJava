package functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentInit;

public class ConsumerExample {
	
	static List<Student> students = StudentInit.getAllStudents(); 
	static Consumer<Student> c1 = (student) -> System.out.println(student);
	static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
	static Consumer<Student> c0 = (student) -> System.out.print(student.getGpa());

	
	public static void printStudents() {
		System.err.println("printing students");
		students.forEach(c1);   //students.forEach( (student) -> System.out.println(student));  // kraca varijanta
	}
	
	public static void printStudentNamesAndActivities() {
		System.err.println("printing student names and activities");
		students.forEach(c2.andThen(c3));
	}
	
	public static void printStudentWithCondition() {
		System.err.println("printing students with conditions");
		students.forEach( (student) -> {
			if(student.getGpa() >= 4.5 ) {
				c0.andThen(c2).andThen(c3).accept(student);     // Mora da stoji .accept(student); na kraju linije
			}
		});
	}

	public static void main(String[] args) {

		Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());
		consumer.accept("zdravo svima");
		
		Consumer<String> consumer2 = (str) -> {
			consumer.accept(str);
			System.out.println("consumer2");
		};
		consumer2.accept("zDravOoo");
		
		printStudents();
		printStudentNamesAndActivities();
		printStudentWithCondition();
	}

}
