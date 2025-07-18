package assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class CeXWebsite {

	public static void main(String[] args) throws InterruptedException {

		// Launching CeX URL in browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://uk.cwr1.uat.webuy.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Signing in on CeX site
		WebElement signInMenu = driver.findElement(By.xpath("//*[@id=\"__nuxt\"]/div/div[1]/header/div/div/div/div[3]/span/div[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(signInMenu));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",signInMenu);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("automationtest@webuy.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Automation@12345");	
		WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/footer/div/button/div/div/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",signInButton);
		System.out.println("Logged in successfully !!");
		
		// Searching & adding product in basket
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
		driver.findElement(By.xpath("//input[@class='search-input']")).sendKeys("iPhone"+"\n");
		WebElement product = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div[2]/div/div[3]/div[2]/div[3]/div[3]/div/div/div[1]/div/div/div/div[1]/div[1]/a/img"));
		wait.until(ExpectedConditions.elementToBeClickable(product));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",product);
		WebElement addToBasket = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div[1]/div[2]/div[4]/div[3]/div/div[2]/button/span/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",addToBasket);
		driver.findElement(By.xpath("//button[@class='cx-btn cx-btn-md cx-btn-block cx-btn-primary mb-base']/span/span[@class='btn-text']")).click();
		System.out.println("Product added in basket successfully !!");
		
		// Basket & Checkout flow
		WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div/div[2]/div/div/div[2]/button/span/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",proceedToCheckout);
		driver.findElement(By.xpath("//*[@id=\"accordion-0\"]/div/div/div[2]/button/span/span")).click();	
		driver.findElement(By.xpath("//*[@id=\"accordion-1\"]/div/div/div[2]/button/span/span")).click();
		driver.findElement(By.xpath("(//*[@id=\"custom\"]/div/label/span)[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"accordion-2\"]/div/div/div[6]/button/span/span")).click();
		
		// Payment Gateway flow
		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().refresh();	
		driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).sendKeys("4444333322221111");
		driver.findElement(By.xpath("//*[@id=\"cardholderName\"]")).sendKeys("Test User");
		driver.findElement(By.xpath("//*[@id=\"expiryMonth\"]")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"expiryYear\"]")).sendKeys("28");
		driver.findElement(By.xpath("//*[@id=\"securityCode\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
		
		driver.close();
		System.out.println("Order placed successfully !!");
		System.out.println("Cex website has been successfully automated !!");
		
	}

}
