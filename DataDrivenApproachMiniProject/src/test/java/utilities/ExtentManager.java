package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	private static ExtentReports extent;
	
	public static ExtentReports getExtRepInstance() {
		
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\extent.report");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("AutomationReportSummary");
		spark.config().setEncoding("utf-8");
		spark.config().setReportName("ExtentReport");
		
		if(extent==null) {
			
			extent =  new ExtentReports();
			extent.attachReporter(spark);
			
			extent.setSystemInfo("Automation Tester", "Prasad Thakare");
			extent.setSystemInfo("Organization", "webuy.com");
			extent.setSystemInfo("Build no", "W-1234");
						
		}
		
		return extent;
	}

}
