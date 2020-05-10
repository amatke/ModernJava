package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentInit;

public class BiConsumerExample {

	public static List<Student> studentList = StudentInit.getAllStudents();
	
	public static void namesAndActivities() {
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println("name : " + name + ", activities: " + activities);
		studentList.forEach( student -> biConsumer.accept(student.getName(), student.getActivities()) );
	}
	
	public static void main(String[] args) {

		namesAndActivities();

	}

}
