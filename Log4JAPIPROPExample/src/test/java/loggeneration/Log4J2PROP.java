package loggeneration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4J2PROP {

	public static void main(String[] args) {
		
		Logger log = LogManager.getLogger(Log4J2PROP.class.getName());
				
		log.error("This is error log");		
		log.debug("This is debug log");
		log.info("This is info log");
				
	}

}
