/**
 *
 *  Creational Pattern - Factory Method
 *
 */
public class Test {

	public static void main(String[] args) {
		Logger testLogger = new LoggerFactory().getLogger();
		testLogger.Log("Factory Pattern Test");
	}

}
