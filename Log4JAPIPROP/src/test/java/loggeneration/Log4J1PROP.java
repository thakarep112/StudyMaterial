package loggeneration;

import java.util.Date;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4J1PROP {

	static Logger log = Logger.getLogger(Log4J1PROP.class.getName());

	public static void main(String[] args) {
		
		
		// In order to generate log file with proper date stamp
		
		Date d = new Date();
		System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));
		
		// Provided log4j.properties file path in order to read the appender configurations
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		
		log.debug("This is debug log");
		log.info("This is info log");
		log.error("This is error log");		
		
	}

}
