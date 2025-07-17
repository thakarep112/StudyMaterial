package seleniumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllOptionElements {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		// Listing all the web element having option tag from the web page
				
		List<WebElement> options = driver.findElements(By.tagName("option"));
		
		System.out.println(options.size());
		System.out.println(options.get(0).getText());
		System.out.println(options.get(70).getText());
		
		for(int i=0; i<options.size(); i++ ) {
			
			System.out.println(options.get(i).getText());	
		}
		
		System.out.println("Task has been completed !!");
	}
}
