package selenium4updates;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptionsCapabilities {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		//1. Headless browser mode using addArguments() method
		//options.addArguments("headless");
		
		//2. Launching browser in Incognito mode
		options.addArguments("incognito");

		//3. Accepting insecure certificate using setAcceptInsecureCerts() method
		options.setAcceptInsecureCerts(true);

		//4. Disabling info bar when launching automated browser
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		//5. Changing the browser window size using addArguments() method
		//options.addArguments("window-size=840,1200");
		
		//6. Launching website in mobile view
		Map<String,String> mobileView = new HashMap<String,String>();
		mobileView.put("deviceName", "iPhone X");
		options.setExperimentalOption("mobileEmulation", mobileView);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/");
		
		System.out.println(driver.getTitle());
		System.out.println("BrowserOptions explored !!");

	}

}
