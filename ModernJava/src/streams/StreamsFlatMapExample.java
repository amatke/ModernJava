package streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentInit;

public class StreamsFlatMapExample {

	static List<Student> studentList = StudentInit.getAllStudents();

	public static List<String> activities(){
		return studentList.stream().				// Stream<Student>
				map(Student::getActivities)			// Stream<List<String>>
				.flatMap(List::stream)				// Stream<String>		-> flatMap se koristi kada je element neka kolekcija
				.collect(Collectors.toList());		
	}
	
	public static List<String> distinctActivities(){
		return studentList.stream().			
				map(Student::getActivities)			
				.flatMap(List::stream)				
				.distinct()							// Stream<String> with distinct function performed
				.collect(Collectors.toList());		
	}
	
	public static List<String> sortedDistinctActivities(){
		return studentList.stream().			
				map(Student::getActivities)			
				.flatMap(List::stream)				
				.distinct()
				.sorted()							// sort distinct Stream<String
				.collect(Collectors.toList());		
	}
	
	public static long countDistinctActivities(){
		return studentList.stream().			
				map(Student::getActivities)			
				.flatMap(List::stream)				
				.distinct()
				.count();							// Counting how many distinct Stream<String> 
	}
	

	
	public static void main(String[] args) {
		
		System.out.println("activities : " + activities());
				
		System.out.println("distinctActivities : " + distinctActivities());
		
		System.out.println("sortedDistinctActivities : " + sortedDistinctActivities());

		System.out.println("countDistinctActivities : " + countDistinctActivities());

	}

}
