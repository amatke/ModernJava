package functionalInterfaces;

import java.util.List;
import java.util.function.Function;

import data.Student;
import data.StudentInit;

public class FunctionExample {

	static List<Student> studentList = StudentInit.getAllStudents();

	static Function<Integer, String> fun = (num) -> num + ". razred " ;
	static Function<String, String> fun2 = (gender) -> gender + " pol ";
	static Function<String, String> funConcat = (str) -> str.toUpperCase() + "something concatenated";
	
	
	public static void main(String[] args) {

		studentList.forEach( s -> System.out.println(fun.apply(s.getGrade()) + s.getName()) );
		
		
		studentList.forEach( s -> System.out.println(fun2.apply(s.getGender()) + s.getName()) );
		
		
		studentList.forEach( s -> System.out.println(fun.andThen(funConcat).apply(s.getGrade())) );
		
		studentList.forEach( s -> System.out.println(fun2.compose(funConcat).apply(s.getGender())) );
	}

}
