package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	// Creating simple test which required UN & Pass as parameters while execution
	@Test(dataProvider = "getData")
	public static void doLogin(String userName, String password) {
		
		System.out.println("Login successful with creds: "+userName+"---&---"+password);
		
	}
	
	// Using a class with Annotation DataProvider - This class will be providing data to other parameterized Tests
	@DataProvider
	public static Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "thakarep1121@gmail.com";
		data[0][1] = "Prasad@test1";
		
		data[1][0] = "thakarep1122@gmail.com";
		data[1][1] = "Prasad@test2";
		
		data[2][0] = "thakarep1123@gmail.com";
		data[2][1] = "Prasad@test3";
		
		return data;
		
	}

}
