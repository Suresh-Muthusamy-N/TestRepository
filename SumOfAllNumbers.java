package LambdaExpressions;

import java.util.Arrays;
import java.util.List;



public class SumOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		//Find the sum of all numbers in a list using reduce().
		int total = list.stream().reduce(0, Integer::sum);
		
		System.out.println(total);
		
		//Find the sum of all numbers in a list using lambda.
		int total1 = list.stream().reduce(1, (x,y)->(x*y));
		System.out.println(total1);

	}

}
