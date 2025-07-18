package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;

public class BankManagerLoginTest extends BaseClass {
	
	@Test
	public void bankManagerLogin() throws InterruptedException {
		
		log.debug("Starting bankManagerLogin test execution !!");
		
		clickWebElement("bankManagerLoginBtn_CSS");
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustomerBtn_CSS"))), "Login seems failed!!");

		log.debug("Test execution is completed !!");
	}

}
