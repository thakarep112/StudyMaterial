package seleniumtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPathExamples {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Automating dummy registration form using xpath locators
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vaibhav Patil");
		driver.findElement(By.xpath("//input[@type='tel'][@name='phone']")).sendKeys("8798009121");
		driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("patilvaibhav@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'cit')]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//form[@class='ajaxsubmit']/fieldset/input[starts-with(@name,'user')]")).sendKeys("patilvaibhav");
		driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/form/fieldset[7]/input")).sendKeys("Vaibhav@12345");
		
		WebElement country = driver.findElement(By.xpath("//fieldset/select[@name='country']"));
		Select select = new Select(country);
		select.selectByVisibleText("Italy");
		
		driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/form/div[1]/div[2]/input")).click();

        System.out.println("Registartion has been successfully completed!!");
		
		
	}

}
