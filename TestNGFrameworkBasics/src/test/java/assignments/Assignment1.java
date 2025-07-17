package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

// Navigate to MakeMyTrip 
// Select Round Trip from A to B with X to Y dates and clicked search
// Print all available flights & their rates in console

public class Assignment1 {

	@Test
	public static void getFlightDetails() throws InterruptedException {

		ChromeOptions options = new ChromeOptions(); 
		options. addArguments("user-data-dir=C:/Users/pthakare/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--profile-directory=Default");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/p[1]/span[1]/span")).click();
	
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")).sendKeys("Goa");
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/p[1]/span[1]/span")).click();
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement startDate = driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[5]"));
		js.executeScript("arguments[0].click();", startDate);
		WebElement endDate = driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[6]/div/p[1]"));
		js.executeScript("arguments[0].click()", endDate);
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/p/a")).click();
				
		Thread.sleep(Duration.ofSeconds(10));
		List<WebElement> flightCards= driver.findElements(By.xpath("//label[contains(@id,'flightCard')]"));
		System.out.println("Total available flights are: "+flightCards.size());
		
		Actions actions = new Actions(driver);
		for(WebElement flightDetails: flightCards) {
			
			actions.moveToElement(flightDetails);
			System.out.println("Flight name: "+flightDetails.findElement(By.xpath("//span[@class='boldFont blackText']")).getText()+" Price is: "+flightDetails.findElement(By.xpath("//p[contains(@class, 'blackText fontSize16')]")).getText());
			
		}	
		
		System.out.println("Flight details has been fetched successfully !!!");
		
	}

}
