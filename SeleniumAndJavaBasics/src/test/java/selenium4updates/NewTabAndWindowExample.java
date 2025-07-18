package selenium4updates;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabAndWindowExample {

	public static void main(String[] args) {

		
		// Launching browser & searching URL and performing some operations in it
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Prasad Thakare");
		
		// Opening new tab in current window & searching URL and performing some operations in it
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Way2Automation");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b']")).click();
		
		// Opening new browser window & searching URL and performing some operations in it
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Read Wikipedia')]")).click();
		
		System.out.println("New tab & window has been opened successfully !!");
		
		// Getting all window handles and storing in Set<String>
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Total open windows are: "+windows.size());
		
		// Creating iterator to iterate string values of Set
		Iterator<String> iterator = windows.iterator();
		
		//Creating List to stored iterator values & get the indexes
		List<String> windowIndexes = new ArrayList<String>();
		
		// Creating while loop to iterate the Set values and Add into the list
		while(iterator.hasNext()) {
			
			windowIndexes.add(iterator.next());
			
		}
		
		// Switching to 1st window
		driver.switchTo().window(windowIndexes.get(0));
		System.out.println("Title of 1st window is: "+driver.getTitle());
		driver.close();
		
		// Switching to 2nd window
		driver.switchTo().window(windowIndexes.get(1));
		System.out.println("Title of 2nd window is: "+driver.getTitle());
		driver.close();
		
		// Switching to 3rd window
		driver.switchTo().window(windowIndexes.get(2));
		System.out.println("Title of 3rd window is: "+driver.getTitle());
		driver.quit();
		
		System.out.println("Windows has been closed successfully !!!");	
		
	}

}
