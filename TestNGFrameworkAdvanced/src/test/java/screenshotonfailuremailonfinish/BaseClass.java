package screenshotonfailuremailonfinish;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public static void setUp() {
		
		if(driver == null){
		driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
	}
	
	
	@AfterSuite
	public static void tearDown() {
		
		driver.quit();
		
	}

}
