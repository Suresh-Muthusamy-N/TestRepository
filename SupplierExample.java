package LambdaExpressions;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use Supplier to generate a random number between 1 and 100.
		Supplier<Integer> randomSupplier = () -> new Random().nextInt(100)+1;
		System.out.println(randomSupplier.get());
		}

}
