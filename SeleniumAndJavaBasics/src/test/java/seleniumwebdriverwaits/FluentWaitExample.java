package seleniumwebdriverwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

	public static void main(String[] args) {


				WebDriver driver = new ChromeDriver();
				driver.get("https://accounts.google.com/v3/signin/identifier?checkedDomains=youtube&ddm=0&flowEntry=ServiceLogin&flowName=GlifWebSignIn&hl=en-gb&ifkv=AdF4I77OLW6cf3bWgEmdOCW1JW-sg4AR0jXFkis-eU4GtXo7MGrcRdGAb7Y6lr0lUFEhjOWdJdniXQ&pstMsg=1&dsh=S168012193%3A1720949756693198");
				driver.manage().window().maximize();
				
				// Implementing Implicitly Wait- To Handle "NoSuchElementException- HTML/CSS taking time to load" exception while interacting with WebElement
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
				driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
				
				// Implementing Fluent Wait- To Handle "ElementNotInteractableException - not reachable by keyboard" exception while interacting with WebElement
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					       .withTimeout(Duration.ofSeconds(10))
					       .pollingEvery(Duration.ofSeconds(5))
					       .ignoring(ElementNotInteractableException.class)
				           .ignoring(ElementClickInterceptedException.class);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("Test@12345");
				
				WebElement next = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
				
				// Implementing Fluent Wait along with moveToElement() Actions- To Handle element "ElementClickInterceptedException- Non-clickable at point" exception while interacting with WebElement
				wait.until(ExpectedConditions.elementToBeClickable(next)).click();
				Actions action = new Actions(driver); 
				action.moveToElement(next).perform();
				
				driver.close();
				
				System.out.println("Implicit & Fluent waits has been implemented successfully !!!");
				
			}
		
	}
