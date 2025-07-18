package overriding;

public class ChromeDriver extends WebDriver {

	public void click() {
		
		System.out.println("Performing Click - ChromeDriver()");
	}
	
	public void sendKeys() {
		
		System.out.println("Typing in an element - ChromeDriver()");
	}
	
	public void getTitle() {
		
		System.out.println("Getting Title - ChromeDriver()");
	}
	
}
