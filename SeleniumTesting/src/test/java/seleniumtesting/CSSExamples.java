package seleniumtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSExamples {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Automating dummy registration form using cssSelector locator
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Vaibhav Patil");
		driver.findElement(By.cssSelector("input[name='phone'][type='tel']")).sendKeys("8798009121");
		driver.findElement(By.cssSelector("input[name^='ema']")).sendKeys("patilvaibhav@gmail.com");
		driver.findElement(By.cssSelector("input[name$='ity']")).sendKeys("Mumbai");
		driver.findElement(By.cssSelector("form.ajaxsubmit > fieldset > input[name*='user']")).sendKeys("patilvaibhav");
		driver.findElement(By.cssSelector("form.ajaxsubmit > fieldset > input[type='password']")).sendKeys("Vaibhav@12345");
		
		WebElement country = driver.findElement(By.cssSelector("select[name='country']"));
		Select select = new Select(country);
		select.selectByVisibleText("Italy");
		
		driver.findElement(By.cssSelector("div#load_box > form > div > div > input:first-child")).click();

        System.out.println("Registartion has been successfully completed!!");
		
	}

}
