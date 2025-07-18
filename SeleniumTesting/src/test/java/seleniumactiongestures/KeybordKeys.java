package seleniumactiongestures;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeybordKeys {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://uk.webuy.com/repairs");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"__nuxt\"]/div/div[1]/header/div/div/div/div[2]/div/div[1]/input"));
		inputBox.sendKeys("Way2Automation");
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"__nuxt\"]/div/div[1]/div[6]/nav/ol/li[2]/a")).click();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.CONTROL+"A")).build().perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"C")).build().perform();
		
		inputBox.click();
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"V")).build().perform();
		action.sendKeys(Keys.ENTER).perform();	
		
		System.out.println("Keyboard keys are working as expected !!");	
		
	}

}
