package seleniumscreenshots;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		                  name.sendKeys("Vaibhav Patil");
		                  
		               // Taking screenshot of element
		                  File  nameScreenshot= name.getScreenshotAs(OutputType.FILE);
		                  FileUtils.copyFile(nameScreenshot, new File("./screenshots/name.png"));
		
		
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel'][@name='phone']"));
		                   phone.sendKeys("8798009121");
		                   File phoneScreenshot = phone.getScreenshotAs(OutputType.FILE);
		                   FileUtils.copyFile(phoneScreenshot, new File("./screenshots/phone.png"));
		
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email' and @name='email']"));
		                   email.sendKeys("patilvaibhav@gmail.com");
		                   File emailSCreenshot = email.getScreenshotAs(OutputType.FILE);
		                   FileUtils.copyFile(emailSCreenshot, new File("./screenshots/email.png"));
		
		
		WebElement password = driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/form/fieldset[7]/input"));
		                      password.sendKeys("Vaibhav@12345");
		                      File passwordScreenshot = password.getScreenshotAs(OutputType.FILE);
		                      FileUtils.copyFile(passwordScreenshot, new File("./screenshots/password.png"));
		                      
		                      System.out.println("Screenshot has been successfully captured for all the elements !!");
		                      
		
	}

}
