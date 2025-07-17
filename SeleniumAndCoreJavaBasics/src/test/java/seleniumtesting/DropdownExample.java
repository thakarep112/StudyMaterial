package seleniumtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		// Locating Drop down on web page
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		
		// Creating object of select class & passing web element as an argument
		
		Select select = new Select(dropdown);
		
		// Selecting drop down values using value & visible text 
		
		select.selectByVisibleText("Eesti");
		select.selectByValue("af");
		
		// Listing all the drop down options and printing their values
		
		List<WebElement> options = select.getOptions();
		
		for(WebElement values : options) {
			
			System.out.println(values.getText());		
		}
		
		System.out.println("Mission Successful !!!");
	}
}
