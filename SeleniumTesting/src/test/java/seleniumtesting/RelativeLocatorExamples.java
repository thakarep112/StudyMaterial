package seleniumtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorExamples {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// RelativeLocator below
		
		WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("Mumbai");
		
		// RelativeLocator above
		
		WebElement above = driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/fieldset[3]/input")).above(By.tagName("select")));
		above.sendKeys("pttest@webuy.com");
		
		// RelativeLocator near
		
		// WebElement near = driver.findElement(RelativeLocator.with(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[2]/div/p[1]/a")).near(By.partialLinkText("LIFETIME")));
		// near.click();
		
		// RelativeLocator toRightof
		
		WebElement torightof = driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).toRightOf(By.tagName("label")));
		torightof.sendKeys("Test123");
		
		// RelativeLocator toLeftof
		
		WebElement toleftof = driver.findElement(RelativeLocator.with(By.linkText("Signin")).toLeftOf(By.xpath("/html/body/div[2]/div/div/div/div/div/form/div[1]/div[2]/input")));
		toleftof.click();
		
		driver.close();
		
		System.out.println("Relative locators has been successful completed !!!");
		
	}
}
