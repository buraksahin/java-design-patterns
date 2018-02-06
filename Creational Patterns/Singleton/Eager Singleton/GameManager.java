/**
 * Singleton
 * Game Manager Singleton Class Example
 */
public final class GameManager{
	// Static Variable of GameManager Instance
	private static final GameManager instance = new GameManager();
	
	// Initialization
	static{System.out.println("Initialization: Initialized GameManager <hash code>: " + instance.hashCode());}
	
	 /**
	  * Get Game Manager Instance
	  * @return instance of the singleton.
	  */
	 public static GameManager getInstance() {
		 System.out.println("getInstance: return GameManager <hash code>: " + instance.hashCode());
		 return instance;
	 }
}
