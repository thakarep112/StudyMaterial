package parallelexecution;

import org.testng.annotations.Test;

public class InvocationCountAndThreadPoolSize extends InvocationBase {
	
	// invocationCount - How many times Test case will get execute
	// threadPoolSize - How many instances will get launched simultaneously to complete test execution.
	
	@Test(invocationCount=2, threadPoolSize=1)
	public static void getBrowserTitle() {
		
		driver = getDriver("chrome");
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		System.out.println("Page title is: "+driver.getTitle());
		driver.quit();	
	}

}
