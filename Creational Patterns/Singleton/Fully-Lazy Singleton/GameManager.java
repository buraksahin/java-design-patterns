/**
 * Singleton
 * Game Manager Singleton Class Example
 */
public final class GameManager{
	
	/**
	 * @return Game Manager instance
	 */
	public static GameManager getInstance(){
		return Nested.instance;
	}

	// Nested Class
	private static class Nested{
		private static final GameManager instance = new GameManager(); 
	}
}
