
public class Test {
	public static void main(String[] args){
		// Create Game Manager
		GameManager GM = GameManager.INSTANCE;
		System.out.println(GM);
		GameManager GM2 = GameManager.INSTANCE;
		System.out.println(GM2);
	}
}
