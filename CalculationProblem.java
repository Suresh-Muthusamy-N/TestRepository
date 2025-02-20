package LambdaExpressions;

public class CalculationProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator add = (a,b) -> a+b;
		Calculator multiply = (a,b) -> (a*b);
		Calculator subtract = (a,b) -> (a-b);
		
		Calculator divide = (a,b) -> (a/b);
		
		System.out.println("Addition :" + add.calc(10, 20));
		System.out.println("Addition :" + multiply.calc(10, 20));
		System.out.println("Addition :" + subtract.calc(10, 20));
		System.out.println("Addition :" + divide.calc(20, 10));
	}

}

@FunctionalInterface
interface Calculator{
	
	int calc(int a , int b);
}