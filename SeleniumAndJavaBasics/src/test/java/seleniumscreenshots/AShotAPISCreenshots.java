package seleniumscreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AShotAPISCreenshots {

	public static void main(String[] args) throws IOException, InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/protractor-angularjs-practice-website.html");
		driver.manage().window().maximize();

		Thread.sleep(Duration.ofSeconds(2));
		
		// Taking page screenshot using AShot API
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1500)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "jpg", new File(".//screenshots//pageAShot.jpg"));
		
		Thread.sleep(Duration.ofSeconds(2));
		
		WebElement logoElement = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[1]/div/a/img"));
		
		// Taking WebElement screenshot using AShot API
		Screenshot elementScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(500)).takeScreenshot(driver, logoElement);
		ImageIO.write(elementScreenshot.getImage(), "jpg", new File(".//screenshots//elementAShot.jpg"));
		
		System.out.println("Screenshot has been captured successfully using AShot API !!");
		
	}

}
