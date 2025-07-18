package seleniumalertwindowpopups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowAndPopups {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Operations on 1st window
		
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> iterate = windowIds.iterator();
		String firstWindow = iterate.next();
		System.out.println("First window is: "+firstWindow);
		System.out.println("First window title is: "+driver.getTitle());
		
		WebElement loginMenu = driver.findElement(By.xpath("//*[@id=\"custom-button\"]/div/div/div/button"));
		Actions action = new Actions(driver);
		action.moveToElement(loginMenu).perform();
		driver.findElement(By.linkText("NetBanking")).click();
		
		// Operations on 2nd window
		
		windowIds = driver.getWindowHandles();
		iterate = windowIds.iterator();
		iterate.next();
		String secondWindow = iterate.next();
		System.out.println("Second window is: "+secondWindow);
		
		driver.switchTo().window(secondWindow);
		System.out.println("Second window title is: "+driver.getTitle());
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//*[@id=\"nortonimg1\"]/div[2]/span[2]/a")).click();
		
		// Operations on 3rd window
		
		windowIds = driver.getWindowHandles();
		iterate = windowIds.iterator();
		iterate.next();
		iterate.next();
		String thirdWindow = iterate.next();
		System.out.println("Third window is: "+thirdWindow);
		
		driver.switchTo().window(thirdWindow);
		System.out.println("Third window title is: "+driver.getTitle());
		System.out.println(driver.getTitle().contains("Best Safety Measures for Secure"));
		
		System.out.println("Task has been completed successfully !!");
		
		
	}

}
