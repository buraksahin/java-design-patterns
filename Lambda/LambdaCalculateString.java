public class LambdaCalculateString{
	
	public static void main(String[] args){
		IString iString = (String s) -> s.length();
		System.out.println(iString.getLength("String Length"));
	}

}

@FunctionalInterface
interface IString{
	int getLength(String s);
}
