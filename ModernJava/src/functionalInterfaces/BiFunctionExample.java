package functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import data.Student;
import data.StudentInit;

public class BiFunctionExample {

	static List<Student> studentList = StudentInit.getAllStudents();
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, studentPredicate ) -> {
		Map<String, Double> retMap = new HashMap<String, Double>();
		studentList.forEach( student -> {
			if (studentPredicate.test(student)) {
				retMap.put(student.getName(), student.getGpa());
			}
		});
		
		return retMap;
	};
	
	public static void main(String[] args) {

		
		System.out.println("BiFunction 1.Studenti u mape i 2.Studenti parnih razred: \n" + biFunction.apply(studentList, PredicateStudentExample.p2));
		
	}

}
