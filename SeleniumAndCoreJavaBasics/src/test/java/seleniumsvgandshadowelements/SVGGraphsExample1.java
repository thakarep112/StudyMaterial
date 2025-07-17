package seleniumsvgandshadowelements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SVGGraphsExample1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.covid19india.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[4]/div[2]/div/div[9]/div[1]/div[1]"))).click();
		WebElement circlePoint = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='svg' and @preserveAspectRatio='xMidYMid meet'])[6]//*[name()='circle']")));
		
		Actions action = new Actions(driver);
			
		action.moveToElement(circlePoint).perform();
		System.out.println("Total affected peoples are: "+driver.findElement(By.xpath("(//div/div[@class='stats-bottom']/h2)[1]")).getText());
			
		System.out.println("SVG graph successfully readed !!");
		
	}
	
}	
