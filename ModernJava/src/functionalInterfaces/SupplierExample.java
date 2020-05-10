package functionalInterfaces;

import java.util.Arrays;
import java.util.function.Supplier;

import data.Student;

public class SupplierExample {

	static Supplier<Student> supplierStudent = () -> new Student("Aleksa", "muski", 4.3, 4, Arrays.asList("Ples", "tenis"));
	
	public static void main(String[] args) {

		System.out.println(supplierStudent.get());
	}

}
