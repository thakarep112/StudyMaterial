package testpackage2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingMultipleBrowserWindows {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://uk.webuy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		
		Set<String> openWindows = driver.getWindowHandles();
		System.out.println("Total open windows are: "+openWindows.size());
		
		Iterator<String> iterator = openWindows.iterator();
		
		List<String> windowList = new ArrayList<String>();
		
		while(iterator.hasNext()) {
			
			windowList.add(iterator.next());
		}
		
		driver.switchTo().window(windowList.get(0));
		System.out.println("Title of the First URL: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(windowList.get(1));
		System.out.println("Title of the Second URL: "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(windowList.get(2));
		System.out.println("Title of the Third URL: "+driver.getTitle());
		driver.quit();
	}
}
