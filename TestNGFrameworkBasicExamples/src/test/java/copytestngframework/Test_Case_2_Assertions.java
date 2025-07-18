package copytestngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case_2_Assertions {
	
	@Test(groups="Functional")
	public void validateTitle() {
		
		String expectedResult = "Webuy.com";
		String actualResult = "Google.com";
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test(groups="Functional")
	public void validateUN() {
		
		Assert.fail("Username is different");
	}
	
	@Test(groups="Integration")
	public void validateImage() {
		
		Assert.assertTrue(false, "Image is missing");
	}
	
	@Test(groups="Integration")
	public void validateNumbers() {
		
		Assert.assertFalse(true, "Numbers are same");
	}
}
