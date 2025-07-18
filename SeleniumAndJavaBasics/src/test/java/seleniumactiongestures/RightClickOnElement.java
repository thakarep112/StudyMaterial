package seleniumactiongestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Right clicking on image element using contextClick() method of Actions class
		WebElement image = driver.findElement(By.xpath("//img[@height='119' and @width='180']"));
		Actions action = new Actions(driver);
		action.contextClick(image).perform();
		
		WebElement productInfo = driver.findElement(By.xpath("//td[@id='dm2m1i1tdT']"));
		action.moveToElement(productInfo).perform();
		
		WebElement installation = driver.findElement(By.xpath("//td[@id='dm2m2i1tdT']"));
		action.moveToElement(installation).perform();
		
		driver.findElement(By.xpath("//td[@id='dm2m3i1tdT']")).click();
		
		System.out.println("Right click action with assignment has been successfully completed !!");
		
	}

}
