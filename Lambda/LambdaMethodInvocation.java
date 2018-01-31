public class LambdaMethodInvocation{
	
	public static void main(String[] args){
		Calculate((x,y) -> x*y);
	}

	private static void Calculate(Calculator _calculator){
		int x=2, y=3;
		System.out.println(_calculator.calculate(x, y));
	}

}

@FunctionalInterface
interface Calculator{
	int calculate(int x, int y);
}
