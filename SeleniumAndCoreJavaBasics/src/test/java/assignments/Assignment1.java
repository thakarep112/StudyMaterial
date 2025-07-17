package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 1
//Go to google.
//In google search type "Way2Automation" and click on very 1st link.
//Print the link count and text from page.

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("APjFqb")).sendKeys("Way2Automation");
		driver.findElement(By.xpath("/html/body//div[4]/center/input[1]")).click();
		driver.findElement(By
				.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div[1]/span"))
				.click();

		// Finding total links from this web page.

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links on this webpage are: " + links.size());

		for (WebElement link : links) {

			System.out.println("Text is----" + link.getText() + "----Link is----" + link.getAttribute("href"));

		}

		System.out.println("Assignment has been completed !!");

	}

}
