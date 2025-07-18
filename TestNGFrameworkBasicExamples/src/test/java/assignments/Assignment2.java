package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// Navigate to "https://www.ironspider.ca/forms/checkradio.htm"
// Randomly clicked any 2 check boxes
// Each time random check boxes should get selected.

public class Assignment2 {
	
	@Test
	public static void selectRandomCheckBoxes() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement colorBlock = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form"));
		
		List<WebElement> colors = colorBlock.findElements(By.name("color"));
		
		System.out.println("Total color checkboxes are: "+colors.size());
		
		WebElement randomCheckbox1 = colors.get(new Random().nextInt(colors.size()));
		randomCheckbox1.click();
		
		WebElement randomCheckbox2 = colors.get(new Random().nextInt(colors.size()));
		randomCheckbox2.click();

		System.out.println("Assignment 2 has been completed succesfully !!");
		
	}
}
