package seleniumdevtools;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v123.network.Network;
import org.openqa.selenium.devtools.v123.network.model.ConnectionType;

public class NetworkSpeedThrottling {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();

		// Performing network throttling using DevTools before launching the URL in browser
		DevTools devTool = ((ChromeDriver) driver).getDevTools();
		devTool.createSession();
		devTool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTool.send(Network.emulateNetworkConditions(false, 100, 20000, 10000, Optional.of(ConnectionType.CELLULAR3G)));
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		System.out.println("Website has been loaded in 3G network !!");
	}

}
