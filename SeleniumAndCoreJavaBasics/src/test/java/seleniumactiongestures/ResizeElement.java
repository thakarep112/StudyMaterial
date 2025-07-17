package seleniumactiongestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		// Printing the height & width of an element by using getSize(), getHeight() & getWidth() methods
		int height = resize.getSize().getHeight();
		System.out.println("Height is: "+height);
		int width = resize.getSize().getWidth();
		System.out.println("Width is: "+width);
		
		// Resizing an element using dragAndDropBy() method of Actions class
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 200, 300).perform();
		
		System.out.println("Element has been resized successfully !!");
		
	}

}
