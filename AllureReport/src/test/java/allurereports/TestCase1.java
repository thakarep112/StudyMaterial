package allurereports;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import static io.qameta.allure.SeverityLevel.*;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;

@Epic("Allure Example")
@Feature("Reg, Login & Logout test")
public class TestCase1 {
	
	@Test
	@Severity(BLOCKER)
	@Description("To verify login functionality")
	@Story("Perform login action")
	public static void doLogin() {
		
		System.out.println("User Login");
		
	}

	@Test
	@Severity(CRITICAL)
	@Description("To verify registration functionality")
	@Story("Perform registration action")
	public static void doReg() {

		System.out.println("User Registration");
		Assert.fail("Failing this Test");
		
	}

	@Test
	@Severity(CRITICAL)
	@Description("To verify log out functionality")
	@Story("Perform logout action")
	public static void doLogout() {
		
		System.out.println("User Logout");
		throw new SkipException("Skipping this Test");

	}

}
