package grid3;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecutionThroughXML {
	
	public Capabilities cap = null;
	protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
	
	public WebDriver getDriver() {
		
		return driver.get();
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	@Parameters({"browserName"})
	public void launchGoogle(String browserName) throws InterruptedException, MalformedURLException {
		
		if(browserName.equals("chrome")) {
	
			cap= new ChromeOptions();			
			Date d = new Date();
			System.out.println(browserName+ " Execution timing: " +d.toString());
			
		}else if(browserName.equals("firefox")){
			
			cap = new FirefoxOptions();			
			Date d = new Date();
			System.out.println(browserName+ " Execution timing: " +d.toString());
			
		}
		
		driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap));
		getDriver().get("https://www.way2automation.com/");
		getDriver().manage().window().maximize();
		System.out.println(getDriver().getTitle());
		Thread.sleep(Duration.ofSeconds(10));
		getDriver().quit();
		
	}

}
