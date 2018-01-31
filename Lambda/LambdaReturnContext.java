public class LambdaReturnContext{

	public static void main(String[] args){
		System.out.println(create().calculate(5,2));
	}

	private static Calculator create(){
		return (x,y) -> x*y;
	}

}

@FunctionalInterface
interface Calculator{
	int calculate(int x, int y);
}
