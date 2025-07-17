package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendEmail {
	
	/*
	 * Login to Gmail Compose an email Subject - "Test Mail" and Body
	 * "Test Email Body" Label email as "Social" Send the email to the same account
	 * which was used to login (from and to addresses would be the same) Wait for
	 * the email to arrive in the Inbox Mark email as starred Open the received
	 * email Verify email came under proper Label i.e. "Social" Verify the subject
	 * and body of the received email
	 */
	
	public String expectedSubject = "Test Mail";
	public String expectedBody = "Thanks & Regards,\r\n" + "Prasad Thakare\r\n" + "Sr. QA Engineer\r\n" + "Mob- +91 8983464097Test Email Body";
	public String expectedLabel = "Social";

	
	@Test
	public void sendMail() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions(); 
		options. addArguments("user-data-dir=C:/Users/pthakare/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--profile-directory=Default");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		/* 1. Login to G-mail account
		driver.findElement(By.id("identifierId")).sendKeys("pthakare@webuy.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"))).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Everythingisfair");
		
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", nextButton);*/
		
		// 2. Sending Mail with label as social
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div/div")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":u6\"]"))).sendKeys("pthakare@webuy.com");
		driver.findElement(By.xpath("//*[@id=\":nh\"]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":qk\"]"))).sendKeys("Test Mail");
		driver.findElement(By.xpath("//*[@id=\":rt\"]")).sendKeys("Test Email Body");
		driver.findElement(By.xpath("//*[@id=\":so\"]/div[2]")).click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\":sr\"]/div/span"))).perform();
		List<WebElement> checkboxes= driver.findElements(By.xpath("//div[@role='menuitemcheckbox' and @title='Social']"));
		checkboxes.get(0).click();
		driver.findElement(By.xpath("//*[@id=\":qa\"]")).click();
		
		// 2. Validating mail & details
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\":29\"]")).click();
		String actualLabel = driver.findElement(By.xpath("//div[@class='aKz' and @data-tooltip='Messages from social networks, media-sharing sites, online dating services and other social websites.']")).getText();
		driver.findElement(By.xpath("//span[@data-tooltip='Not starred']")).click();
		driver.findElement(By.xpath("//div[@class='y6']/span/span")).click();
		
		String actualSubject = driver.findElement(By.xpath("//h2[@jsname='r4nke']")).getText();
		String actualBody = driver.findElement(By.xpath("//div[@class='gmail_signature']")).getText();

		Assert.assertEquals(actualLabel, expectedLabel);
		Assert.assertEquals(actualSubject, expectedSubject);
		Assert.assertEquals(actualBody, expectedBody);
		
		System.out.println("Email has been sent & details are verified !!");
		driver.quit();
		
	}

}
