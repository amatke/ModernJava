package functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import data.Student;
import data.StudentInit;

public class FunctionExample2 {

	static List<Student> studentList = StudentInit.getAllStudents();
	
	static Function<List<Student>, Map<String, Double>> studentGpaFunction = students -> {
		Map<String, Double> studentGpaMap = new HashMap();		 // ili new TreeMap() | LinkedHashMap() | HashMap();
		studentList.forEach( student -> studentGpaMap.put(student.getName(), student.getGpa()));
		return studentGpaMap;
	};
	
	static Function<List<Student>, Map<String, Double>> studentGpaFunctionConditioned = students -> {
		Map<String, Double> studentGpaMap = new HashMap();		 // ili new TreeMap() | LinkedHashMap() | HashMap();
		studentList.forEach( student -> { 
			if (PredicateStudentExample.p2.test(student))
				studentGpaMap.put(student.getName(), student.getGpa());
		});
		return studentGpaMap;
	};
	
	
	public static void main(String[] args) {
		System.out.println(studentGpaFunction.apply(studentList));
		
		System.out.println(studentGpaFunctionConditioned.apply(studentList));
		
	}

}
