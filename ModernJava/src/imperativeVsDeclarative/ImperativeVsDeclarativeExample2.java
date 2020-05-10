package imperativeVsDeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1,2,2,3,4,5,5,5,6,7,7,8,9,10);
		
		// imperativni stil programiranja -> kako programiram

		List<Integer> uniqueList = new ArrayList<Integer>();
		for (Integer integer : integerList) {
			if(!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println("Imperativ - uniqueList : " + uniqueList);
		
		
		// deklarativni stil programiranja -> sta programiram?
		
		List<Integer> uniqueList1 = integerList.stream()
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println("Deklarativ - uniqueList : " + uniqueList1);
	}

}
