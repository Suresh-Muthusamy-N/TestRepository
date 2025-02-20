package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str= Arrays.asList("ravi", "sankar", "naren", "satish");
		
		Optional<String> firstLetter =str.stream()
										.filter(str1 -> str1.startsWith("s"))
										.findFirst();
		
	 firstLetter.ifPresent(System.out::println);
	}

}
