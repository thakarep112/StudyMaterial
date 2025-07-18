package seleniumactiongestures;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Sliding element using dragAndDropBy() method of Actions class
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions action = new Actions(driver);
		//action.dragAndDropBy(slider, 400, 0).perform();
		
		WebElement slidingBar = driver.findElement(By.xpath("//div[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"));
		int barWidth = slidingBar.getSize().getWidth();
		action.dragAndDropBy(slider, barWidth/2, 0).perform();
		
		System.out.println("Element has been slided successfully !!");
	 	
	}

}
