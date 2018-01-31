public class IntersectionType{
	
	public static void main(String[] args){
		// Make lambda expression serializable
		java.io.Serializable s = (java.io.Serializable & FunctionOne) (x,y) -> x+y;
		System.out.println(((FunctionOne) s).sum(4,2));
	}

}

@FunctionalInterface
interface FunctionOne{
	public int sum(int x, int y);
}
