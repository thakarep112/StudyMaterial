package seleniumactiongestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("Way2Automation");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).click();
		driver.findElement(By.xpath("//div[@data-hveid='CA4QAA']/div/div/div/span/a/div/div/div/div/span[@class='VuuXrf']")).click();
		
		//Moving to WebElement and hovering cursor on it using moveToElement() method
		WebElement resource = driver.findElement(By.xpath("//li[@id='menu-item-27617']/a/span[@class='menu-text']"));
		Actions action = new Actions(driver);
		action.moveToElement(resource).perform();
		
		driver.findElement(By.linkText("Practice Site 1")).click();
		
		System.out.println("Hover & click action performed successfully !!");
		
		
	}

}
