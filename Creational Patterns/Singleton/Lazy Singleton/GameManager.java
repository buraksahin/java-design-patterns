/**
 * Singleton
 * Game Manager Singleton Class Example
 */
public final class GameManager{
	// Game Manager Instance Variable
	private static GameManager instance;
	
	// Game Manager Constructor
	GameManager(){
		// Prevent instantiating
		if(instance != null){
			throw new IllegalStateException("Already initialized.");			
		}
	}
	
	/**
	 * Get Game Manager instance
	 * @return GameManager
	 */
	public static synchronized GameManager getInstance(){
		if(instance == null){
			instance = new GameManager();
		}
		return instance;
	}
}
