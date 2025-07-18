package interfaces;

public class ChromeDriver implements RemoteWebDriver {

	@Override
	public void click() {
		
		System.out.println("click - ChromeDriver()");
		
	}

	@Override
	public void sendKeys() {
		
		System.out.println("sendKeys - ChromeDriver()");
		
	}

	@Override
	public void getTitle() {
		
		System.out.println("getTitle - ChromeDriver()");
		
	}

	@Override
	public void captureScreenshot() {
		
		System.out.println("captureScreenshot - ChromeDriver()");
		
	}
	
	

}
