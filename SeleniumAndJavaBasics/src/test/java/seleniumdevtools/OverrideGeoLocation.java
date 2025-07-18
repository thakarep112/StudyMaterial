package seleniumdevtools;

import java.time.Duration;
import java.util.Optional;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v123.emulation.Emulation;

public class OverrideGeoLocation {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
		
		// Managing GeoLocation using DevTools before launching the URL in browser
	    DevTools devTool =	((ChromeDriver) driver).getDevTools();
	    devTool.createSession();
	    devTool.send(Emulation.setGeolocationOverride(Optional.of(51.5072), Optional.of(0.1276), Optional.of(100)));
	   
		driver.get("https://iplocation.io/my-location");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		System.out.println("GeoLocation has been changed successfully !!");
		
	}

}
