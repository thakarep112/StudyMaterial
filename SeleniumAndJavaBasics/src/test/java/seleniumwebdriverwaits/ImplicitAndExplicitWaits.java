package seleniumwebdriverwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWaits {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?checkedDomains=youtube&ddm=0&flowEntry=ServiceLogin&flowName=GlifWebSignIn&hl=en-gb&ifkv=AdF4I77OLW6cf3bWgEmdOCW1JW-sg4AR0jXFkis-eU4GtXo7MGrcRdGAb7Y6lr0lUFEhjOWdJdniXQ&pstMsg=1&dsh=S168012193%3A1720949756693198");
		driver.manage().window().maximize();
		
		// Implementing Implicitly Wait- To Handle "NoSuchElementException- HTML/CSS taking time to load" exception while interacting with WebElement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		// Implementing Explicitly Wait- To Handle "ElementNotInteractableException - not reachable by keyboard" exception while interacting with WebElement
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("Test@12345");
		
		WebElement next = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		
		// Implementing Explicitly Wait along with moveToElement() Actions- To Handle element "ElementClickInterceptedException- Non-clickable at point" exception while interacting with WebElement
		wait.until(ExpectedConditions.elementToBeClickable(next)).click();
		Actions action = new Actions(driver); 
		action.moveToElement(next).perform();
		
		driver.close();
		
		System.out.println("Implicit & Explicit waits has been implemented successfully !!!");
		
	}

}
