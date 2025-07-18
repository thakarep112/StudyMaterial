package seleniumdevtools;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class SimulateDeviceMatrics {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Managing Device Views using DevTools before launching the URL in browser
		DevTools devTool = ((ChromeDriver) driver).getDevTools();
		devTool.createSession();

		/* 2nd way of achieving this- Not working at the moment
		 * devTool.send(Emulation.setDeviceMetricsOverride(375, 812, 50, true,
		 * Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
		 * Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
		 * Optional.empty(), Optional.empty()));
		 */

		@SuppressWarnings("serial")
		Map<String, Object> deviceSimulation = new HashMap<String, Object>() {

			{

				put("width", 375);
				put("height", 812);
				put("mobile", true);
				put("deviceScaleFactor", 50);

			}
		};

		((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceSimulation);

		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

		System.out.println("Divice view has been changed successfully !!");

	}

}
