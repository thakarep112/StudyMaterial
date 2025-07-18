package selenium4updates;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCoordinates {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https:google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement img = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		// Getting the location & size of above element using getRect() method
		Rectangle rect = img.getRect();
		
		// Printing Height, Width, X & Y Co-ordinates of above element using available methods
		System.out.println("Height of element is: "+rect.getHeight());
		System.out.println("Width of element is: "+rect.getWidth());
		System.out.println("X Co-ordinate of element is: "+rect.getX());
		System.out.println("Y Co-ordinate of element is: "+rect.getY());
		
		System.out.println("Web element co-ordinates has been measured successfully !!");
		
	}

}
