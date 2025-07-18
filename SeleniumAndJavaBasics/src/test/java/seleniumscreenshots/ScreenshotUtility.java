package seleniumscreenshots;

import org.openqa.selenium.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotUtility {
		
	public static WebDriver driver;
	
	// Creating Method to capture page screenshot
	public static void getPageScreenshot() throws IOException {
				
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_");
		
		File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pageScreenshot, new File(".//screenshots//"+fileName+".png"));
		
	}
	
	// Creating Method 1 to capture page screenshot
	public static void getElementScreenshot1(WebElement logoElement) throws IOException {
		
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_");
		
		File elementScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullImage = ImageIO.read(elementScreenshot);
		
        Point point = logoElement.getLocation();
        int elementHeight = logoElement.getSize().height;
        int elementWidth = logoElement.getSize().width;
        
        BufferedImage subImage = fullImage.getSubimage(point.getX(), point.getY(), elementWidth, elementHeight);
        ImageIO.write(subImage, "png", elementScreenshot);
        
        File screenshotLocation = new File(".//screenshots//"+fileName+".png");
        FileUtils.copyFile(elementScreenshot, screenshotLocation);
		
	}
	
	// Creating Method 2 to capture element screenshot
	public static void getElementScreenshot2(WebElement flagElement) throws IOException {
		
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_");
		
		File elementScreenshot = ((TakesScreenshot) flagElement).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(elementScreenshot, new File(".//screenshots//"+fileName+".png"));
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Calling getPageScreenshot() method from utility to capture pageScreenshot
		getPageScreenshot();
		
		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement logoElement = driver.findElement(By.xpath("//*[@id=\"MzYwOjY4NA==-1\"]"));
		
		// Calling getElementScreenshot1() method 1 from utility to capture logoElementScreenshot
		getElementScreenshot1(logoElement);
		
		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement flagElement = driver.findElement(By.xpath("//*[@id=\"MjgwOjE3MQ==-1\"]"));
		
		// Calling getElementScreenshot2() method from utility to capture flagElementScreenshot
		getElementScreenshot2(flagElement);
		
		System.out.println("Screenshot utility has been created successfully !!");
		
	}

}
