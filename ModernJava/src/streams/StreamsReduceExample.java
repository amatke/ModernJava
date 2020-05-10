package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import data.Student;
import data.StudentInit;

public class StreamsReduceExample {

	static List<Integer> nummbers = Arrays.asList(1,3,5,7);
	static List<Integer> nummbers2 = new ArrayList<Integer>();
	static List<Student> studentList = StudentInit.getAllStudents();


	public static long multiplyReduce() {					
		return nummbers.stream()						//1: 1=default vrednos , a=1(default vred) b=1(numbers[0])  rez=1
				.reduce(1, (a,b) -> a*b);				//2: rez=1 , a=1(rez) b=3(numbers[1])  rez=3
	}													//3: rez=3 , a=3(rez) b=5(numbers[2])  rez=15
														//4: rez=15 , a=15(rez) b=7(numbers[3])  rez=105
	
	

    public static Optional<Integer> multiplyReduceWithoutIdentity(){
        return nummbers2.stream().reduce( (a,b) -> a*b); // performs multiplication for each element in the stream and returns a new result fo.
    }
	
    
    public static Optional<Student> getHighestGpa(){
        return studentList.stream()
        		.reduce( (s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2 );
    }
	
	public static void main(String[] args) {

		System.out.println(multiplyReduce());
		
		Optional<Integer> res = multiplyReduceWithoutIdentity();
		if (res.isPresent()) {
			System.out.println(res.get());
		} else {
			System.out.println("Result is: 0. Postoji element liste koji je null!");
		}
		
		
		Optional<Student> res2 = getHighestGpa();
		if (res2.isPresent()) {
			System.out.println(res2.get());
		}
		
	}

}
