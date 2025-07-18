package testcases;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import utilities.UtilityClass;

public class CustomerLoginTest extends BaseClass {
	
	
	@Test(dataProviderClass=UtilityClass.class, dataProvider="dataProvider")
	public void customerLogin(String fullName) throws IOException {
		
		log.debug("Starting customerLogin test execution !!");
		
		String expectedWelcomeText= fullName;
		
		clickWebElement("homeBtn_CSS");
		clickWebElement("customerLoginBtn_CSS");
		selectDropdownValue("yourNameDrop_XPATH",fullName);
		clickWebElement("loginBtn_CSS");
		
		String actualWelcomeText = driver.findElement(By.cssSelector(OR.getProperty("welcomeScreen_CSS"))).getText();
		verifyEqualsSoftAssertions(actualWelcomeText, expectedWelcomeText);
		
		log.debug("Test execution is completed !!");
		
	}

}
