package selenium4updates;

import java.time.Duration;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationUNPassExample {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		// New way to pass userName & Password in basic authentication, using register method
		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// Old way to pass userName & Password in basic authentication, Injecting UN/Pass in URL
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Authentication has been passed successfully !!");
		
	}

}
