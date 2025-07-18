package overriding;

public class InternetExplorerDriver extends WebDriver {
	
	public void click() {
		
		System.out.println("Performing Click - InternetExplorerDriver()");
	}
	
	public void sendKeys() {
		
		System.out.println("Typing in an element - InternetExplorerDriver()");
	}
	
	public void getTitle() {
		
		System.out.println("Getting Title - InternetExplorerDriver()");
	}

}
