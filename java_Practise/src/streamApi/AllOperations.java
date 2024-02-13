package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllOperations {
	
	//filter out the data in even format
	
	
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,7,4,0,2,3,5,6,4,8,9,456,45,2,1,6,5,64,8,6,42);
		List<Integer> evenNumbers = numbers.stream().filter(x-> x % 2 == 0).collect(Collectors.toList());
		
		
		
		System.out.println(evenNumbers);
	}

}
