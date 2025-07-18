package interfaces;

public class TestInterfaceExamples {

	public static void main(String[] args) {
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.click();
		fd.sendKeys();
		fd.getTitle();
		
		ChromeDriver cd = new ChromeDriver();
		cd.click();
		cd.sendKeys();
		cd.getTitle();
		cd.captureScreenshot();
		
		
	}

}
