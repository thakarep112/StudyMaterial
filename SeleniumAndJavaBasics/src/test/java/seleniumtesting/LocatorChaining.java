package seleniumtesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorChaining {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Finding Password input field between UserName field & link text Sign in & entering password
		
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.above(By.linkText("Signin"))
				.below(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
		        .sendKeys("Prasad@12345");
		
		// Finding City input field between fields UserName & Country & entering City

		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.below(By.tagName("select"))
				.above(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")))
		        .sendKeys("Mumbai");
		
		System.out.println("Task has been completed !!!");
		
	}

}
