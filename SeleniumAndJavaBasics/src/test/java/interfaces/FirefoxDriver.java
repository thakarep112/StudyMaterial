package interfaces;

public class FirefoxDriver implements WebDriver {

	@Override
	public void click() {
		
		System.out.println("click - FirefoxDriver()");
		
	}

	@Override
	public void sendKeys() {
		
		System.out.println("sendKeys - FirefoxDriver()");
		
	}

	@Override
	public void getTitle() {
		
		System.out.println("getTitle - FirefoxDriver()");
		
	}
}
