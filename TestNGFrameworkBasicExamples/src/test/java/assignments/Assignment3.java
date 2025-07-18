package assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

// Navigate to Amazon site.
// Search for product.
// Select very 1st product from result.
// From PDP page add that product in cart.
// Navigate to cart & get product name
// Validate the name of product with expected product.

public class Assignment3 {

	@Test
	public static void validateProductName() {
		
		String expectedProduct = "SAMSUNG Galaxy S24 Ultra Cell Phone, 256GB AI Smartphone, Unlocked Android, 50MP Zoom Camera, Lon…";
		
		// Launching browser with my default user profile
		ChromeOptions options = new ChromeOptions(); 
		options. addArguments("user-data-dir=C:/Users/pthakare/AppData/Local/Google/Chrome/User Data");
		options.addArguments("--profile-directory=Default");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Logged in on Amazon
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("thakarep112@gmail.com");
		driver.findElement(By.xpath("(//*[@id=\"continue\"])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Manjar@12345");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
		// Adding product into the cart
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy S24 Ultra Mobile Phone"+"\n");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
		
		// Validating product name with expectedProduct
		WebElement cartProduct = driver.findElement(By.linkText("SAMSUNG Galaxy S24 Ultra Cell Phone, 256GB AI Smartphone, Unlocked Android, 50MP Zoom Camera, Lon…"));
		String actualProduct = cartProduct.getText();
		Assert.assertEquals(actualProduct, expectedProduct);
		
		System.out.println("Assignment 3 has been completed. Product name validated successfully !!");
		
	}
}
