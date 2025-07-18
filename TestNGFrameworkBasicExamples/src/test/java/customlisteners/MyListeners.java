package customlisteners;

import org.testng.Reporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// Inherited 
public class MyListeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {

		System.out.println("Test Begins here: "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		// Adding hard coded screenshot in report as a link - Should open in same tab
		Reporter.log("<a href=\"C:\\Users\\pthakare\\Selenium Testing\\eclipse-workspace\\SeleniumTesting\\screenshots\\name.png\"> Test Evidence</a>");
		System.out.println("Test has been passed successfully: "+result.getName());

	  }

	public void onTestFailure(ITestResult result) {
		
		// Adding hard coded screenshot in report as a link - Should open in new tab
		// Adding hard coded screenshot in report as a thumb-nail
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\pthakare\\Selenium Testing\\eclipse-workspace\\SeleniumTesting\\screenshots\\page.png\" target=\"_blank\">Screenshot Captured !!!</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\pthakare\\Selenium Testing\\eclipse-workspace\\SeleniumTesting\\screenshots\\page.png\" target=\"_blank\"><img height=200 width=200 src=\"C:\\Users\\pthakare\\Selenium Testing\\eclipse-workspace\\SeleniumTesting\\screenshots\\page.png\"></a>");
		System.out.println("Test failed...Capturing screenshot for failed case: "+result.getName());

	  }

	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Test case skipped !!");
		System.out.println("Test has been skipped: "+result.getName());

	  }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Oops...Almost there but unfortunetly failed: "+result.getName());
		
	  }

	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	public void onStart(ITestContext context) {
		
	    
	  }

	public void onFinish(ITestContext context) {
		
	    
	  }

}
