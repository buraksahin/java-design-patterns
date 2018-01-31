import java.util.function.Function;

public class LambdaStaticMethodReference{

	/**
	 *	A lambda expression represents an anonymous function defined in
	 *	a functional interface. A static method reference allows us to
	 *	use a static method as a lambda expression.
	 */

	public static void main(String[] args){
		// Using a lambda expression
		Function<Integer, String> functionOne = x -> Integer.toBinaryString(x);
		System.out.println(functionOne.apply(7));
		
		// Using a method expression
		Function<Integer, String> functionTwo = Integer::toBinaryString;
		System.out.println(functionTwo.apply(7));
	}

}
