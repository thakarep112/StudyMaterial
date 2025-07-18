package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment4 {

// Assignment 4
// Launch browser in smaller resolutions & then slowly drag it and make bigger
	
	public static void main(String[] args) {

		// Launching browser window in small dimensions using ChromeOptions()
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=80,100");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.way2automation.com/");
		
		// Getting the Width & Height of the browser window using getSize() method 
		System.out.println("Initial browser window Width is: "+driver.manage().window().getSize().getWidth());	
		System.out.println("Initial browser window Height is: "+driver.manage().window().getSize().getHeight());	
		
		// Setting the new Width & Height of the browser window using setSize() method
        driver.manage().window().setSize(new Dimension(1000, 500));
		
		System.out.println("Assignment 4 has been completed successfully !!");		
		
	}

}
