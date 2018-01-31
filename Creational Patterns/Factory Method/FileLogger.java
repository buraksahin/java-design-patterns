import java.io.*;
import java.util.Date;

public class FileLogger implements Logger{
	
	// File Logger
	public void Log(String message){
		Date currentDate = new Date();
		try{
			// If file doesn't not exist create and set file name else append current file
			FileOutputStream fOS = new FileOutputStream(this.hashCode() + ".txt", true);
			// Output Stream Writer
			OutputStreamWriter oSW = new OutputStreamWriter(fOS);
			// String Writer
			Writer writeFile = new BufferedWriter(oSW);
			// Write message with current date
			writeFile.write(currentDate.toString() + " : " + message + "\n");
			// Close File
			writeFile.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}	
	}

}
