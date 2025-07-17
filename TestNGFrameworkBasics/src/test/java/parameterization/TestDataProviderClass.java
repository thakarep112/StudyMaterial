package parameterization;

import org.testng.annotations.Test;

// Getting required parameters from DataPrivider class which defined in a separate class
public class TestDataProviderClass {
	
	@Test(dataProviderClass=DataProviderClass.class, dataProvider="dataProvider")
	public static void testLoginData(String userName, String password) {
		
		System.out.println(userName+"-----"+password);
	}
	
	@Test(dataProviderClass=DataProviderClass.class, dataProvider="dataProvider")
	public static void testSignupData(String firstName, String lastName, String email) {
		
		System.out.println(firstName+"-----"+lastName+"-----"+email);
	}

}
