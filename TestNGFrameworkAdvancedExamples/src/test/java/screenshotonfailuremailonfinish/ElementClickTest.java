package screenshotonfailuremailonfinish;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementClickTest extends BaseClass {

	@Test(priority=1)
	public static void testElememtClick() {

		driver.findElement(By.linkText("Register")).click();

	}

	@Test(priority=2)
	public static void testBrowser() {
		
		Assert.fail("Failing this case knowingly to capture screenshot");

	}
}
