package seleniumtesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		WebElement element = driver.findElement(By.xpath("/html/body/button"));
		
		// Directly passing onclick() JavaScript function of web element in executeScript method to perform clicked operation
		// 1st way of calling executeScript() method from JavascriptExecutor Interface
		
		((JavascriptExecutor) driver).executeScript("document.getElementById('demo').innerHTML = Date()");
		
		// Using readymade JavaScript to highlight web element
		// 2nd way of calling executeScript() method from JavascriptExecutor Interface
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", element);
		
		System.out.println("Clicked action has been performed successfully using Javascript function !!");
		System.out.println("Highlight action has been performed successfully using readymade Javascript !!");

		
	}

}
