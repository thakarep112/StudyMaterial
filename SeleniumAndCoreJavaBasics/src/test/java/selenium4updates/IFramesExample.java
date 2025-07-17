package selenium4updates;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		// Switching to frame with id-iframeResult
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		// Switching to 1st frame under frameId-iframeResult with index(0)
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
			
		// Switching back to parent frame by using old way - defaultContent() method to navigate back to main screen and from main screen navigating back to parent frame with Id
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframeResult");
		
		// Switching to 2nd frame under frameId-iframeResult with index(1)
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='search2']")).sendKeys("Testing");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		// Switching back to parent frame by using new way - parentFrame() method
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("/html/body/button")).click();
		
		System.out.println("Successfully switched to parent frame !!");
		
	}

}
