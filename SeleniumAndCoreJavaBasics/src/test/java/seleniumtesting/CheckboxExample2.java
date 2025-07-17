package seleniumtesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    
	    // Locating block where check boxes are present
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form"));
		
		// Locating check boxes in above block 
		
		List<WebElement> checkbox= block.findElements(By.tagName("input"));
		
		System.out.println("Total checkboxes are: "+checkbox.size());
		
		// Manually checking particular checkbox
		
		/*checkbox.get(1).click();
		checkbox.get(3).click();
		checkbox.get(5).click();*/
		
		// Clicking all the check boxes available in selected box
		
		int count =0;
		for(int i=0; i<checkbox.size(); i++) {
			
			checkbox.get(i).click();
			count++;
			
		}
		
		System.out.println("Total number of boxes clicked: "+count);

	}

}
