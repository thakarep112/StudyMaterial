package seleniumtesting;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PresenceOfElement {

	// Creating isElementPresent() method by own to check presence of element on
	// webpage

	public static WebDriver driver;

	public static boolean isElementPresent1(By by) {
		try {

			driver.findElement(by);
			return true;

		} catch (Throwable T) {

			return false;
		}
	}

	public static boolean isElementPresent2(By by) {

		List<WebElement> list = driver.findElements(by);
		int size = list.size();

		if (size == 0) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		// Checking the visibility of an element by using isDisplayed() method

		System.out.println(driver.findElement(By.id("searchLanguage")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());

		// Checking the Presence of an elements using own created methods

		System.out.println(isElementPresent1(By.xpath("//*[@id=\"searchLanguage\"]")));
		System.out.println(isElementPresent1(By.xpath("//*[@id=\"searchLanguage123\"]")));
		
		System.out.println(isElementPresent2(By.id("searchLanguage")));
		System.out.println(isElementPresent2(By.id("searchLanguage123")));

	}

}
