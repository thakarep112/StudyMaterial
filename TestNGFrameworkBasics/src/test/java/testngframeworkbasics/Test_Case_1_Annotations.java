package testngframeworkbasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case_1_Annotations extends BaseTest {

	// Using method with Annotation BeforeMethod - Execute before each Method
	@BeforeMethod
	public void launchBrowser() {

		System.out.println("Browser Launched successfully !!");

	}

	// Using method with Annotation AfterMethod - Execute after each Method
	@AfterMethod
	public void closeBrowser() {

		System.out.println("Browser closed successfully !!");

	}

	// Using method with Annotation BeforeTest - Execute before Test
	@BeforeTest
	public void turnOnDB() {

		System.out.println("DB connections established successfully !!");

	}

	// Using method with Annotation AfterTest - Execute after Test
	@AfterTest
	public void turnOffDB() {

		System.out.println("DB connections terminated successfully !!");

	}

	// Using method with Test Annotation with priority=1
	@Test(priority = 1)
	public void doSignUp() {

		System.out.println("Signed-up successfully !!");

	}

	// Using method with Test Annotation with priority=2
	@Test(priority = 2)
	public void doLogin() {

		System.out.println("Logged in successfully !!");

	}
}
