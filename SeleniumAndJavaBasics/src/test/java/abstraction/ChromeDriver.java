package abstraction;

public abstract class ChromeDriver extends WebDriver {
	
	public abstract void getBrowserInstance();
	
	public void getTotal() {
		
		System.out.println("Concrete Method - ChromeDriver()");
	}
	
}

