import java.util.Date;

public class ScreenLogger implements Logger{

	// Screen Logger
	public void Log(String message) {
		Date currentDate = new Date();
		System.out.println(currentDate.toString() + " : " + message + "\n");
	}

}
