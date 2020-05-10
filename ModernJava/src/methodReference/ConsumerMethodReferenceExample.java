package methodReference;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentInit;

public class ConsumerMethodReferenceExample {
	
	static List<Student> studentList = StudentInit.getAllStudents();

	// classname::methodName
	static Consumer<Student> c1 = System.out::println;
	
	//className::instanceMethodName
	static Consumer<Student> c2 = Student::printActivities;

	
	public static void main(String[] args) {

		studentList.forEach(c1);
		studentList.forEach(c2);
	}

}
