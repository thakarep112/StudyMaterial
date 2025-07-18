package seleniumtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
        // Clicking 1 checkbox using xpath directly
		
	    driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]")).click();
	    
	    // Clicking check boxes using loop by identifying pattern in their x-path
	    
	    for(int i=2; i<=6; i++) {
	    	
	    	driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input["+i+"]")).click();
	    	
	    }
		
	}

}
