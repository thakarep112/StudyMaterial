package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvocationBase {
	
	public static WebDriver driver = null;
	
	public static WebDriver getDriver(String browser) {
		
		if(browser.equals("chrome")) {
			
			driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			
			driver = new FirefoxDriver();
			
		}else{
			
			driver = new InternetExplorerDriver();
		}
		
		return driver;
	}

}
