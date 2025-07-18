package seleniumtesting;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOfWebpage {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"js-lang-list-button\"]/span")).click();
		
		// Listing all the web element having links(<a>tag) from the web page
				
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		System.out.println(links.get(0).getText());
		
		for(WebElement link : links) {
			
			System.out.println("All the links of webpage are----"+link.getText()+"----"+link.getAttribute("href"));		
		}
		
		System.out.println("Task has been completed !!");
	}
}
