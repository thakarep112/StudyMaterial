package seleniumwebdriverlistener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class WebDriverListenerExample {

	public static void main(String[] args) {

        
		// Integrating WebDriver, MyListeners & EventFiringDecorator to generate WebDriverListener events
		WebDriver original = new ChromeDriver();
		WebDriverListener listener = new MyListeners();
		WebDriver driver = new EventFiringDecorator<WebDriver>(listener).decorate(original);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Navigating to URL
		driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-gb&ifkv=AdF4I749J7dazA_7yIxLhDGXTFJ-n4oxwoGS9Ec6GGpLG2FArOct_GaRCuMurTDqy3FOjAkPhEXm&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1494024822%3A1720946090142053&ddm=0");
		
		// Printing title of page
		driver.getTitle();
		
		// Typing E-mail ID
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		
		// Clicking Next button
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		// Typing Password
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Test@12345");
		
		// Quitting current browser session
		driver.quit();
		
	}

}
