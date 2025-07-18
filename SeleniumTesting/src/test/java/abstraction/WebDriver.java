package abstraction;

public abstract class WebDriver { //Abstract Class
	
	public abstract void click();   //Abstract Method
	
	public abstract void sendKeys();
	
	public abstract void getTitle();
	
    public void captureScreenshot() {   //Concrete Method
		
		System.out.println("Concrete Method - WeDriver()");
	}

}
