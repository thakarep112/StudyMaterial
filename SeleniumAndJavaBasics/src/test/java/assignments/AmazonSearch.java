package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonSearch {
	
	@Test
	public void searchProduct() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.linkText("Analogue")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leather"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Titan"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("25% Off or more"))).click();
		
		List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']"));
		System.out.println("Total search results are: "+searchResults.size());
		System.out.println("Product details are: "+searchResults.get(4).getText());
		searchResults.get(4).click();
		
		//Switching to new window where clicked product details are opened
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		List<String> windowIndexes = new ArrayList<String>();
		
		while(iterator.hasNext()) {
			
			windowIndexes.add(iterator.next());
		}
		
		driver.switchTo().window(windowIndexes.get(1));
		
		System.out.println("Product Name is: "+driver.findElement(By.xpath("//span[@id='productTitle']")).getText());		
		System.out.println("mobiux - Product details has been fetched successfully!");
		driver.quit();
				
	}

}
