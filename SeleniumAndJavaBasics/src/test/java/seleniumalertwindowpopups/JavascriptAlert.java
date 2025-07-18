package seleniumalertwindowpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavascriptAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		//Switching to Alert pop-up & handling it
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		// Another way to handle Alert pop-up is using explicit wait with ExpectedConditions
		/*
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); Alert
		 alert1 = wait.until(ExpectedConditions.alertIsPresent()); alert1.accept();
		 */
		
		System.out.println("Alert handled successfully !!");
		
	}

}
