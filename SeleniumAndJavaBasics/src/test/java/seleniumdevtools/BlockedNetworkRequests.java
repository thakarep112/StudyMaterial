package seleniumdevtools;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v123.network.Network;

import com.google.common.collect.ImmutableList;

public class BlockedNetworkRequests {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();

		// Blocking network requests  using DevTools before launching the URL in browser
		DevTools devTool = ((ChromeDriver) driver).getDevTools();
		devTool.createSession();
		devTool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTool.send(Network.setBlockedURLs(ImmutableList.of("*.png", "*.jpg", "*.jpeg")));
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		System.out.println("Images has been blocked from the webpage !!");
	}

}
