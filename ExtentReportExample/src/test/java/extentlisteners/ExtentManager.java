package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports createInstance(String fileName) {
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);

		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setDocumentTitle("AutomationReportSummary");
		sparkReporter.config().setEncoding("utf-8");
		sparkReporter.config().setReportName("ExtentReport");

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Automation Tester", "Prasad Thakare");
		extent.setSystemInfo("Organization", "Way2Automation");
		extent.setSystemInfo("Build no", "W2A-1234");

		return extent;
	}

	/*
	 * public static String screenshotPath; public static String screenshotName;
	 * 
	 * public static void captureScreenshot() {
	 * 
	 * File scrFile = ((TakesScreenshot)
	 * DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
	 * 
	 * Date d = new Date(); screenshotName = d.toString().replace(":",
	 * "_").replace(" ", "_") + ".jpg";
	 * 
	 * try { FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") +
	 * "\\reports\\" + screenshotName)); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * }
	 */

}
