package parallelexecution;

import java.time.Duration;
import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionThroughXML {
	
	@Parameters({"browser"})
	@Test
	public static void testBrowserName(String browser) throws InterruptedException {
		
		Date d = new Date();
		System.out.println("Browser name is: "+browser+", Execution time: "+d);
		Thread.sleep(Duration.ofSeconds(2));
	}

}
