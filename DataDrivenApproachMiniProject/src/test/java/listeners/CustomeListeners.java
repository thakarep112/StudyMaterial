package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

import base.BaseClass;
import utilities.UtilityClass;


public class CustomeListeners extends BaseClass implements ITestListener{
	
    public void onTestStart(ITestResult result) {

    	test=rep.createTest(result.getName().toUpperCase());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, result.getName().toUpperCase()+": PASSED");
		
	  }

	public void onTestFailure(ITestResult result) {
		
		try {
			
			UtilityClass.captureScreenshot();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		test.log(Status.FAIL, result.getName().toUpperCase()+" FAILED due to: "+result.getThrowable());
		test.addScreenCaptureFromPath(UtilityClass.screenshotName);
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("Click here to view screenshot");
		Reporter.log("<a target=\"_blank\" href="+UtilityClass.screenshotName+">Sceenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+UtilityClass.screenshotName+"><img src="+UtilityClass.screenshotName+" height=200 width=200></img></a>");
 
	  }

	public void onTestSkipped(ITestResult result) {
		

	  }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	  }

	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	public void onStart(ITestContext context) {
		
	    
	  }

	public void onFinish(ITestContext context) {
		
		if(rep != null) {
			
			rep.flush();
			
		}

	  }

}
