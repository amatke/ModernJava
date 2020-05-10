package defaults;

import java.util.Comparator;
import java.util.List;

import data.Student;
import data.StudentInit;

public class DefaultExample2 {

	static List<Student> studentList = StudentInit.getAllStudents();
	
	static Comparator<Student> nameComparator = Comparator.comparing( Student::getName ); 	 // s -> s.getName()
	static Comparator<Student> gpaComparator = Comparator.comparingDouble( s -> s.getGpa() );  // Student::getGpa
	static Comparator<Student> genderComparator = Comparator.comparing( Student::getGender );  // s-> s.getGender()

	
	public static void sortByName(){
		studentList.sort(nameComparator);
		studentList.forEach(System.out::println);
	}
	
	public static void sortByGpa(){
		studentList.sort(gpaComparator.reversed());			// opadajuce poredak
		studentList.forEach(System.out::println);
	}
	
	public static void sortByGender(){
		studentList.sort(genderComparator);
		studentList.forEach(System.out::println);
	}
	
	public static void comparatorChaining(){
		studentList.sort(nameComparator.thenComparing(gpaComparator.reversed()).thenComparing(genderComparator));
		studentList.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		 System.err.println("sortByName() : ");
		 sortByName();
		 
		 System.err.println("sortByGpa() : ");
		 sortByGpa();
		 
		 System.err.println("sortByGender() : ");
		 sortByGender();
		 
		 System.err.println("comparatorChaining() : ");
		 comparatorChaining();
	}

}
