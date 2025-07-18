package seleniumsvgandshadowelements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElementsExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("chrome://downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Getting the upper most tag from where main root is started >> which contains all shadow tags 
		WebElement mainRoot = driver.findElement(By.cssSelector("downloads-manager"));
		// Getting 1st shadow tag present under main root
		SearchContext shadow1 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",mainRoot);
		
		// Finding all other shadow tags present inside 1st shadow tag which founded above
		WebElement root1 = shadow1.findElement(By.cssSelector("downloads-toolbar"));
		SearchContext shadow2 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root1);
		
		WebElement root2 = shadow2.findElement(By.cssSelector("cr-toolbar"));
		SearchContext shadow3 = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root2);
		
		WebElement root3 = shadow3.findElement(By.cssSelector("cr-toolbar-search-field"));
		SearchContext mainShadowTag = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root3);
		
		mainShadowTag.findElement(By.id("searchInput")).sendKeys("Testing shadow tag elements");
		
		System.out.println("Shadow tag element has been found successfully !!");
		
	}

}
