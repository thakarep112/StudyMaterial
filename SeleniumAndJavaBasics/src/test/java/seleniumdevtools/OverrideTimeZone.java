package seleniumdevtools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v123.emulation.Emulation;

public class OverrideTimeZone {

	public static void main(String[] args) throws InterruptedException {


		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webbrowsertools.com/timezone/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// Changing timeZone using DevTools
		DevTools devTool = ((ChromeDriver) driver).getDevTools();
		devTool.createSession();
		devTool.send(Emulation.setTimezoneOverride("EST"));
		
		driver.get("https://webbrowsertools.com/timezone/");
		
		System.out.println("TimeZone has been changed successfully !!");
		
	}

}
