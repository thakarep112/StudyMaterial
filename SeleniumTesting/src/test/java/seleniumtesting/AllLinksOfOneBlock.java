package seleniumtesting;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOfOneBlock {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// Finding 1 block from web page which is having few links
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/footer/nav"));

		// Listing all the web element having links(<a>tag) from the selected block
		
		List<WebElement> blockLinks = block.findElements(By.tagName("a"));
		
		System.out.println("Total links are: "+blockLinks.size());
		
		for(int i=0; i<blockLinks.size(); i++) {
			
			System.out.println("Links are----"+blockLinks.get(i).getText()+"-----"+blockLinks.get(i).getAttribute("href"));
		}
		
		System.out.println("All the links are printed from selected block !!");
				
	}

}
