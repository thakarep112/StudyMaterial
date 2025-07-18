package overriding;

public class Base {
	
	public WebDriver getBrowserInstance(String browserName) {
		
		if(browserName.equals("firefox")) {
			
		return new FirefoxDriver();
			
		}else if(browserName.equals("chrome")) {
			
			return new ChromeDriver();
			
		}else if(browserName.equals("internetexplorer")){
			
			return new InternetExplorerDriver();
			
		}else {
			
			 return new ChromeDriver();
		}
		
	}

}
