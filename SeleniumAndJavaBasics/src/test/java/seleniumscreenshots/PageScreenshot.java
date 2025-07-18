package seleniumscreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageScreenshot {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vaibhav Patil");
		driver.findElement(By.xpath("//input[@type='tel'][@name='phone']")).sendKeys("8798009121");
		driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("patilvaibhav@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'cit')]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//form[@class='ajaxsubmit']/fieldset/input[starts-with(@name,'user')]")).sendKeys("patilvaibhav");
		driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/form/fieldset[7]/input")).sendKeys("Vaibhav@12345");
		
		// Taking screenshot of visible page
		
		File pageScreenshot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pageScreenshot, new File("./screenshots/page.png"));
		
		// Taking screenshot of full page
		
		File fullPageScreenshot = driver.getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fullPageScreenshot, new File("./screenshots/fullPage.png"));
		
		System.out.println("Screenshot has been successfully captured for page !!");
		
	}

}
