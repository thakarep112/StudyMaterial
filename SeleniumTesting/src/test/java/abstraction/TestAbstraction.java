package abstraction;

public class TestAbstraction {

	public static void main(String[] args) {

		ChildChromeDriver driver = new ChildChromeDriver();
	//  Calling concrete methods of inherited parent through child class object reference variable.
		driver.captureScreenshot();
		driver.getTotal();
		
	//  Calling overridden methods of inherited parent through child class object reference variable.
		driver.click();
		driver.sendKeys();
		driver.getTitle();
		driver.getBrowserInstance();
		
		WebDriver driver1 = new ChildChromeDriver(); // Polymorphic reference 
		driver1.click();
		driver1.sendKeys();
		driver1.getTitle();
        driver1.captureScreenshot();
        
    //  We can not call child class methods which are not defined in parent class using polymorphic reference of Parent.
	//	driver1.getBrowserInstance();
	//	driver1.getTotal();

	}

}
