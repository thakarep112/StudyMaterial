package seleniumactiongestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnhancementExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		int x = gmailLink.getRect().getX();
		int y = gmailLink.getRect().getY();
		
		// Moving to element using moveByOffset() method of Actions class by passing X & Y co-ordinates of an element
		Actions action = new Actions(driver);
		action.moveByOffset(x, y).click().perform();
		
		System.out.println("Task has been completed successfully !!");
		
	}

}
