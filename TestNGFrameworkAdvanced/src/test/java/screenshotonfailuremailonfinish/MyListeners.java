package screenshotonfailuremailonfinish;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result) {

		
	}

	public void onTestSuccess(ITestResult result) {
		

	  }

	public void onTestFailure(ITestResult result) {

		String methodName = result.getName();
		
		try {
			testUtil.captureScreenshot(methodName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
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
		
		// Zipping the screenshots folder
		testUtil.zip(System.getProperty("user.dir")+"\\screenshots");
		
		MonitoringMail mail = new MonitoringMail();
		try {
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  }

}
