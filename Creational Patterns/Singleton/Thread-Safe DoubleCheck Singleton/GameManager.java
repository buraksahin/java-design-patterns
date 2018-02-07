/**
 * Singleton
 * Game Manager Singleton Class Example
 */
public final class GameManager{

	// Volatile Game Manager instance
	private static volatile GameManager instance;

	{System.out.println("Initialized GameManager <hashCode>: " + hashCode());}
	// Private Constructor
	//private GameManager(){ // For Production
	GameManager(){ // For Testing
		if (instance != null){
			// throw new IllegalStateException("Already initialized.");
			System.out.println("All ready initialized");
		}
	}

	/**
	 * getInstance return Game Manager instance
	 * 
	 * @return an instance of the class.
	 */
	public static GameManager getInstance(){
		
		// Local variable GameManager instance
		GameManager localInstance = instance;

		// Check localInstance is null to prevent instantiate new GameManager
		if (localInstance == null){
			// Lock on an object to get mutual exclusion.
			synchronized (GameManager.class){
				System.out.println("Sychronized getInstance");
				
				// Set localInstance and check again
				localInstance = instance;
				if (localInstance == null){
					// Create an instance as localInstance
					instance = localInstance = new GameManager();
				}
			}
		}
		System.out.println("Return GameManager <hashcode>: " + instance.hashCode());
		// Return (Game Manager) localInstance
		return localInstance;
	}
}
