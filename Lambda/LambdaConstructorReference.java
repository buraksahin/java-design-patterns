import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaConstructorReference{

	public static void main(String[] args){
		// Supplier Lambda Expression
		Supplier<String> functionOne = () -> new String("Supplier Constructor Reference for String");
		System.out.println(functionOne.get());
		
		// Function Lambda Expression
		Function<String, String> functionTwo = s -> new String(s);
		System.out.println(functionTwo.apply("Function Constructor"));
		
		// Supplier Static Reference Lambda Expression
		Supplier<String> functionThree = String::new;
		System.out.println("Supplier Constructor." + functionThree.get());
		
		// Function Static Reference Lambda Expression
		Function<String, String> functionFour = String::new;
		System.out.println(functionFour.apply("Static Reference Function"));
	}

}
