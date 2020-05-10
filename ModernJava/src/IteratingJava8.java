import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IteratingJava8 {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		//external iterator (how to do) - Sequantial programmingl
//		for (Integer v : values) {
//			System.out.println(v);
//		}
		
		
		//internal iterator (what to do) - Functional programming 
//		values.forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer v) {
//				System.out.println(v);
//			}
//		});
		
		
		//internal iterator (what to do) - Functional programming 
		//values.forEach( v -> System.out.println(v));
		
		//internal iterator (what to do) - Functional programming 
		//values.forEach( (v) -> System.out.println(v));
				
		//internal iterator (what to do) - Functional programming 
		//values.forEach( (Integer v) -> System.out.println(v));
		
		//internal iterator (what to do) - Functional programming 
		values.forEach(System.out::println);
	}

}
