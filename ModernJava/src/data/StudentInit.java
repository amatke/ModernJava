package data;

import java.util.Arrays;
import java.util.List;

public class StudentInit {

	public static List<Student> getAllStudents() {
		Student student1 = new Student("Aleksa", "muski", 5.0, 4, Arrays.asList("Fudbal", "Kosarka", "Plivanje"));
		Student student2 = new Student("Jovana", "zenski", 4.0, 4, Arrays.asList("Fudbal", "Kosarka", "Plivanje"));
		
		Student student3 = new Student("Marko", "muski", 4.2, 2, Arrays.asList("Stoni tenis", "Kosarka", "Aerobik"));
		Student student4 = new Student("Dunja", "zenski", 4.8, 2, Arrays.asList("Fudbal", "Kosarka", "Plivanje"));
		
		Student student5 = new Student("Dusan", "muski", 3.4, 1, Arrays.asList("Pikado", "Kosarka", "Plivanje"));
		Student student6 = new Student("Suzana", "zenski", 4.6, 1, Arrays.asList("Fudbal", "Kosarka", "Bocenje"));
				
		return Arrays.asList(student1, student2, student3, student4, student5, student6);
	}
}
