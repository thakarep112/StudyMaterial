package seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowsersExample {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		} else {
			driver = new ChromeDriver();
		}

		// To open URL in launched browser
		driver.get("https://way2automation.com");

		// To get title of open/current page.
		String title = driver.getTitle();

		// To print the title & its length
		System.out.println("Page title is " +title);
		System.out.println("Title length is " +title.length());

		// To closed current browser window
		driver.close();

		// To closed all the browser windows of current session
		driver.quit();

	}

}
