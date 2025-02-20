package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStream {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("cricket", "baseball", "tennis");
		List<String> strUpper = str.stream()
				.map(String :: toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(strUpper);
		
	}

}
