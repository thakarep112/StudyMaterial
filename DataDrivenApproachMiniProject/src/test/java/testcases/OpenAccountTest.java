package testcases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import base.BaseClass;
import utilities.UtilityClass;

public class OpenAccountTest extends BaseClass {
	
	@Test(dataProviderClass=UtilityClass.class,dataProvider="dataProvider")
	public void openAccount(String customerName, String currency) {
		
		log.debug("Starting openAccount test execution !!");
		
		clickWebElement("openAccountBtn_CSS");
		selectDropdownValue("customerDropdown_CSS", customerName);
		selectDropdownValue("currencyDropdown_CSS", currency);
		clickWebElement("processBtn_CSS");
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		log.debug("Test execution is completed !!");
		
	}
	
}
