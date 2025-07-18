package testpackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class TestClass {	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.way2automation.com/");
		driver.manage().window().maximize();
		WebElement viewImages = driver.findElement(By.xpath("//span[text()='View All Images']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", viewImages);
		driver.navigate().back();
		driver.navigate().refresh();
	}
}
