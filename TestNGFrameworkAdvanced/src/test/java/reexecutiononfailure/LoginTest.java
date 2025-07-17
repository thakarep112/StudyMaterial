package reexecutiononfailure;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	static int count ;
	
	@Test(retryAnalyzer = Retry.class)
	public static void doLogin() {
		
		count++;
		Assert.assertEquals(count, 3);
		
	}

}
