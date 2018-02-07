
public class Test {
	public static void main(String[] args){
		// Get created GameManager instance
		GameManager GM1 = GameManager.getInstance();
		System.out.println("-----GM1-----" + GM1 + "-----------------\n");
		GameManager GM2 = GameManager.getInstance();
		System.out.println("-----GM2-----" + GM2 + "-----------------\n");
		
		// Create new GameManager
		@SuppressWarnings("static-access")
		GameManager GM3 = new GameManager().getInstance();
		System.out.println("-----GM3-----" + GM3 + "-----------------\n");
	}
}
