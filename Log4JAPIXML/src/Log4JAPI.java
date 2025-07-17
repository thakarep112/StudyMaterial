import org.apache.log4j.Logger;

public class Log4JAPI {
	
	static Logger log = Logger.getLogger(Log4JAPI.class);

	public static void main(String[] args) {
		
		// Creating error logs for Debug, Info & Error using logger reference.
		
		log.debug("This is debug log");
		log.info("This is info log");
		log.error("This is error log");		
		
	}

}
