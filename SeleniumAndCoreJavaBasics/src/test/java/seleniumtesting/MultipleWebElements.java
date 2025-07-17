package seleniumtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class MultipleWebElements {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Storing all labels available on Dummy Registration Form in the list
		
		List<WebElement> labels = driver.findElements(RelativeLocator.with(By.tagName("label")).below(By.xpath("/html/body/div[2]/div/div/div/div/div/form/h3")));
		
		// Printing size of List<WebElement>
		
		System.out.println(labels.size());
		
		// Printing all the label values using for each loop
		
		for(WebElement label: labels) {
			
			System.out.println(label.getText());
			
		}
		
		System.out.println("Task has been completed !!!");
	}
}
