package LambdaExpressions;

import java.util.function.Function;

public class SqureOfNumber {
	public static void main(String[] args) {
		int num =5;
		
		Function<Integer,Integer> square = a-> (a*a);
		
		System.out.println(square.apply(5));
		 	
	}
}
