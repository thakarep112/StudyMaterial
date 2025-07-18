package seleniumalertwindowpopups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Printing ID's of all the IFrames present on main page
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames on webpage: "+frames.size());
		for(WebElement frame: frames) {
			
			System.out.println("Frame ID is: "+frame.getAttribute("id"));
		}
		
		// Switching to IFrame with name/ID-iframeResult
		//driver.switchTo().frame("iframeResult");
		
		//Alternate way to switch on frame using x-path of frame
		WebElement framePath = driver.findElement(By.xpath("//div/div/div/div/iframe[@frameborder='0']"));
		driver.switchTo().frame(framePath);
		System.out.println("Total frames on IFrame with name-iframeResult: "+driver.findElements(By.tagName("iframe")).size());
		driver.findElement(By.xpath("/html/body/button")).click();
		
		// Switching back to main page or parent
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"menuButton\"]")).click();
		
		System.out.println("IFrame example has been completed successfully !!");
		
	}

}
