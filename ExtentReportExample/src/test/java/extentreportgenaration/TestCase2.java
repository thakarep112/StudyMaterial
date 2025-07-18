package extentreportgenaration;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public static void doLogin() {
		
		System.out.println("User Login");
		
	}

	@Test
	public static void doReg() {

		System.out.println("User Registration");
		Assert.fail("Failing this Test");
		
	}

	@Test
	public static void doLogout() {
		
		System.out.println("User Logout");
		throw new SkipException("Skipping this Test");

	}

}
