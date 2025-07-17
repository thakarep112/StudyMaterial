package seleniumdevtools;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v124.network.Network;
import org.openqa.selenium.devtools.v124.network.model.Headers;

public class RequestAndResponseHeaders {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Getting Request & Response headers of a service using DevTools
		DevTools devTool = ((ChromeDriver) driver).getDevTools();
		devTool.createSession();
		devTool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		// Capturing Request Headers
		devTool.addListener(Network.requestWillBeSent(), request -> {

			Headers header = request.getRequest().getHeaders();

			if (!header.isEmpty()) {

				System.out.println("----------Request Headers----------");
				header.forEach((key, value) -> {

					System.out.println(key + " = " + value);

				});
			}
		});

		// Capturing Response Headers
		devTool.addListener(Network.responseReceived(), response -> {

			Headers header = response.getResponse().getHeaders();

			if (!header.isEmpty()) {

				System.out.println("----------Response Headers----------");
				header.forEach((key, value) -> {

					System.out.println(key + " = " + value);

				});
				
			}
			
			// Printing Request URL & Status code
			System.out.println("Request URL is: " + response.getResponse().getUrl());
			System.out.println("Status Code is: " + response.getResponse().getStatus());
		});
		
		
		// Creating custom header using DevTools
		Map<String, Object> customHeader = new HashMap<String, Object>();
		customHeader.put("customHeaderName", "customHeaderValue");
		customHeader.put("Vaibhav","Way2Automation");
		Headers header = new Headers(customHeader);
		devTool.send(Network.setExtraHTTPHeaders(header));

		driver.get("https://reqres.in/api/users?page=2");
		driver.manage().window().maximize();

		System.out.println("Request & Response headers has been captured successfully !!");
		System.out.println("Request URL & Status code has been printed successfully !!");

	}

}
