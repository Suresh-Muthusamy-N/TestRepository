package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


//Given a list of strings, filter only the ones with a length greater than 4 using Predicate.
public class LengthFinding {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("ravi","dragon","germany","goa");
		
		Predicate<String> lengthMoreThanFour = word -> word.length() > 4;	
		
		List<String> result = words.stream().filter(lengthMoreThanFour)
											.collect(Collectors.toList());
		result.forEach(System.out::println);
		
	}
}
