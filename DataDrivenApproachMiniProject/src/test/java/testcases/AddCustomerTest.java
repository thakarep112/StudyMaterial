package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import utilities.UtilityClass;

public class AddCustomerTest extends BaseClass {
	
	@Test(dataProviderClass=UtilityClass.class,dataProvider="dataProvider")
	public void addCustomer(String firstName, String lastName, String postCode, String alertText) {
		
		log.debug("Starting addCustomer test execution !!");
		
		clickWebElement("addCustomerBtn_CSS");
		typeIntoWebElement("customerFirstName_CSS",firstName);
		typeIntoWebElement("customerLastName_CSS",lastName);
		typeIntoWebElement("customerPostcode_CSS",postCode);
		clickWebElement("addCustomer_CSS");
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains(alertText), "Customer creation seems failed!!");
		alert.accept();
		
		log.debug("Test execution is completed !!");

	}

}
