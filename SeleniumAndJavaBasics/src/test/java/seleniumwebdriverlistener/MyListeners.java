package seleniumwebdriverlistener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class MyListeners implements WebDriverListener {
	
	
	public void afterGet(WebDriver driver, String url) {
		
		System.out.println("Successfully navigated to webpage URL: "+url);
		
	}
	
	public void afterGetTitle(WebDriver driver, String result) {
		
		System.out.println("Webpage title is: "+result);
		
	}
	
	public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
		
		for(int i=0; i<keysToSend.length; i++) {
			
			System.out.println("Typing is completed! Keys typed are: "+keysToSend[i]+ " ");
			
		}
		
	}
	
	public void afterClick(WebElement element) {
		
		System.out.println("Successfully clicked on WebElement: "+element);
		
	}

	public void afterQuit(WebDriver driver) {
		
		System.out.println("Session has been terminated successfully !!");
		
	}

}
