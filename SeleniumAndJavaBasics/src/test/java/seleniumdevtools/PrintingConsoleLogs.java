package seleniumdevtools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v124.console.Console;
import org.openqa.selenium.devtools.v124.log.Log;

@SuppressWarnings("deprecation")
public class PrintingConsoleLogs {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Printing Error logs from the browser console using DevTools
		DevTools devTool = ((ChromeDriver) driver).getDevTools();
		devTool.createSession();
		devTool.send(Log.enable());
		devTool.addListener(Log.entryAdded(), entry -> {

			System.out.println("Error log text is: " +entry.getText());
			System.out.println("Error log source is: " +entry.getSource());
			System.out.println("Error log level is: " +entry.getLevel());
			System.out.println("Error log timestamp is: " +entry.getTimestamp());

		});

		// Printing Text logs from browser console using DevTools
		devTool.send(Console.enable());
		devTool.addListener(Console.messageAdded(), message -> {

			System.out.println("Console text is: " +message.getText());

		});

		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();

		// Creating my own console log by using JavascriptExecutor
		((JavascriptExecutor) driver).executeScript("console.log('This is test log - Self created')");

		System.out.println("Console logs has been captured successfully !!");
	}

}
