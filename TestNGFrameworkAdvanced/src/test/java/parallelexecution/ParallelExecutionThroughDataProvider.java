package parallelexecution;

import java.time.Duration;
import java.util.Date;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelExecutionThroughDataProvider {
	
	@Test(dataProvider="getData")
	public static void testBrowserName(String browser) throws InterruptedException {
		
		Date d = new Date();
		System.out.println("Browser name is: "+browser+", Execution time: "+d);
		Thread.sleep(Duration.ofSeconds(1));
	}
	
	@DataProvider(parallel = true)
	public static Object getData() {
		
		Object[][] data = new Object[2][1];
		data[0][0] = "chrome";
		data[1][0] = "firfox";
		
		return data;
	}
}
