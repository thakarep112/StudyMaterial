package testngframeworkbasics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	@BeforeSuite
	public void setUp() {
		
		System.out.println("Servers has been started successfully !!");
		
	}
	
	@AfterSuite
	public void taerDown() {
		
		System.out.println("Servers has been stopped successfully !!");
		
	}

}
