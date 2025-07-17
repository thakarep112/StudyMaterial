package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

// Assignment 2
// Navigate to Way2Automation test site
// Enter City, Select Country
// Enter Name & Click on Submit button without using X-path locator

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Typing City
		
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.below(By.tagName("select"))
				.above(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
		        .sendKeys("Mumbai");
		
		// Selecting country from drop down
		
		WebElement dropdown = driver.findElement(By.name("country"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Italy");
		
		// Typing Name
		
		driver.findElement(By.name("name"))
		.sendKeys("Vaibhav Thakare");
		
		// Clicking on Submit
		
		driver.findElement(RelativeLocator.with(By.className("button"))
				.toRightOf(By.linkText("Signin")))
		        .click();
		
		System.out.println("Assignment has been completed !!");		
		
		
	}

}
