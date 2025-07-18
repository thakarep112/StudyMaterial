package overriding;

public class Implementation extends Base {
	
	String browserName= "chrome";
	
	public void initiateBrowser() {
		
		WebDriver Driver = getBrowserInstance(browserName);
		Driver.click();
		Driver.sendKeys();
		Driver.getTitle();
	}

	public static void main(String[] args) {
		
		Implementation ip = new Implementation();
		ip.initiateBrowser();
	}

}
