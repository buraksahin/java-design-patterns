public class LambdaAssignmentContext{

	public static void main(String[] args){
		Calculator calculate = (x,y) -> x*y;
		System.out.println(calculate.calculate(5,2));
	}

}

@FunctionalInterface
interface Calculator{
	int calculate(int x, int y);
}
