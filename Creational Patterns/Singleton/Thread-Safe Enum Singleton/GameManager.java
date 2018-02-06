/**
 * Singleton
 * Game Manager Singleton Class Example
 */
public enum GameManager {
	
	INSTANCE;
	
	static {
		System.out.println("Initialized GameManager Enum <hash code>: " + INSTANCE.hashCode());
	}
	
	@Override
	public String toString() {
		return getDeclaringClass().getCanonicalName() + " <hash code>: " + hashCode();
	}
}
