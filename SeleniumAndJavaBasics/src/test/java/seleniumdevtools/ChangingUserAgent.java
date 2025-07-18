package seleniumdevtools;

import java.util.Optional;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v124.network.Network;

public class ChangingUserAgent {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Changing User Agent of browser by using DevTools
		DevTools devTool = ((ChromeDriver) driver).getDevTools();
		devTool.createSession();
		
		String fakeUserAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 14_5) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.5 Safari/605.1.15";
		devTool.send(Network.setUserAgentOverride(fakeUserAgent, Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("https://www.whatsmyua.info/");
		driver.manage().window().maximize();
		
		System.out.println("User Agent has been updated successfully !!");

	}

}
