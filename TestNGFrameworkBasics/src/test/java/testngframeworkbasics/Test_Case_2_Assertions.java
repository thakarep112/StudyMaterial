package testngframeworkbasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case_2_Assertions extends BaseTest {
	
	@Test
	public void validateTitle() {
		
		String expectedResult = "Webuy.com";
		String actualResult = "Google.com";
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void validateUN() {
		
		Assert.fail("Username is different");
	}
	
	@Test
	public void validateImage() {
		
		Assert.assertTrue(false, "Image is missing");
	}
	
	@Test
	public void validateNumbers() {
		
		Assert.assertFalse(true, "Numbers are same");
	}
}
