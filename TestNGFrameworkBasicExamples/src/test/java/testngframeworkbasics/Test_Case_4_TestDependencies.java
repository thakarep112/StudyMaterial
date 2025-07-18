package testngframeworkbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case_4_TestDependencies extends BaseTest {

	@Test(priority = 1)
	public void turnOnDB() {

		System.out.println("Executing TurnON DB");

	}

	@Test(priority = 2)
	public void doSignUp() {

		System.out.println("Executing User Sign-up");
		Assert.fail("User registration unsuccessful");

	}

	// Marking Test as dependsOnMethods=("doSignUp") so that it only executes if marked Test is passed
	@Test(priority = 3,dependsOnMethods=("doSignUp"))
	public void doLogin() {

		System.out.println("Executing User Login");

	}

	// Marking Test as alwaysRun=true so that Test always executes without checking the result of dependent case if any
	@Test(priority = 4,dependsOnMethods=("doSignUp"), alwaysRun=true)
	public void turnOffDB() {

		System.out.println("Executing TurnOFF DB");

	}

}
