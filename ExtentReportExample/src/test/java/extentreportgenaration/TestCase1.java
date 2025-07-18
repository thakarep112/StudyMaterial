package extentreportgenaration;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase1 {

	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeTest
	public static void setReport() {

		sparkReporter = new ExtentSparkReporter("./ExtentReports/extentReport.html");

		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setEncoding("utf-8");
		sparkReporter.config().setDocumentTitle("AutomationReportSummary");
		sparkReporter.config().setReportName("ExtentReport");


		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);

		extent.setSystemInfo("Automation QA", "Prasad Thakare");
		extent.setSystemInfo("Build No", "v0.0.30");
		extent.setSystemInfo("Organization", "webuy.com");

	}

	@AfterTest
	public static void closeReport() {

		extent.flush();

	}

	@Test
	public static void doLogin() {

		test = extent.createTest("Login Test");
		System.out.println("User Login");

	}

	@Test
	public static void doReg() {

		test = extent.createTest("Registartion Test");
		System.out.println("User Registration");
		Assert.fail("Failing this Test");

	}

	@Test
	public static void doLogout() {

		test = extent.createTest("Logout Test");
		System.out.println("User Logout");
		throw new SkipException("Skipping this Test");

	}

	@AfterMethod
	public static void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
			test.fail("<details>" + "<summary>" + "<b>" + "<font clor=" + "red>" + "Exception Occurred: Click to see" + "</font>" + "</b>" + "</summary>" + exceptionMessage.replaceAll(",","<br>") + "</details>" + " \n");

			String failureLog = "TEST CASE FAILED";

			Markup m = MarkupHelper.createLabel(failureLog, ExtentColor.RED);
			test.log(Status.FAIL, m);

		} else if (result.getStatus() == ITestResult.SKIP) {

			String methodName = result.getMethod().getMethodName();

			String logTest = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + "  SKIPPED";

			Markup m = MarkupHelper.createLabel(logTest, ExtentColor.ORANGE);
			test.skip(m);

		} else if (result.getStatus() == ITestResult.SUCCESS) {

			String methodName = result.getMethod().getMethodName();

			String logTest = "<b>" + "TEST CASE: - " + methodName.toUpperCase() + "  PASSED";

			Markup m = MarkupHelper.createLabel(logTest, ExtentColor.GREEN);
			test.pass(m);

		}

	}

}
