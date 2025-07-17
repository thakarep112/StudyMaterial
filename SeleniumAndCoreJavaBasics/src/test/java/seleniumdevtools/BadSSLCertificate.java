package seleniumdevtools;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v124.security.Security;


public class BadSSLCertificate {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// Managing SSL certificate using DevTools before launching the URL in browser
	    DevTools devTool =	((ChromeDriver) driver).getDevTools();
	    devTool.createSession();
	    devTool.send(Security.enable());
	    devTool.send(Security.setIgnoreCertificateErrors(true));		
		
		driver.get("https://expired.badssl.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		System.out.println("SSL certificate has been ignored successfully !!");		
	}

}
