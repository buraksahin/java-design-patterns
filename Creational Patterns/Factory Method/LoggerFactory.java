import java.io.IOException;
import java.util.Properties;

public class LoggerFactory{

	/*  Logger Factory Method Return FileLogger or ScreenLogger
	 *  as filelogger.properties settings
	 */
	public Logger getLogger(){
        // Check FileWrite properties
        if(isFileLoggingEnabled()){
            return new FileLogger();
        }
        else{return new ScreenLogger();}
	}

	/*	isFileLoggingEnabled: Check filelogger.properties
	 *	if FileWrite properties is ON return true otherwise
	 *	if FileWrite properties is OFF return false
	 */
	public boolean isFileLoggingEnabled(){
		Properties propertiesFile = new Properties();
		try{
			propertiesFile.load(ClassLoader.getSystemResourceAsStream("filelogger.properties"));
			String fileLoggingValue = propertiesFile.getProperty("FileWrite");

			if(fileLoggingValue.equalsIgnoreCase("ON") == true){return true;}
			else{return false;}
            }
			catch (IOException e){return false;}
	}

}
