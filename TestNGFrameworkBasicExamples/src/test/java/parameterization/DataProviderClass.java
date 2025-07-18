package parameterization;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name ="dataProvider")
	public static Object getData(Method m) {
		
		Object[][] data = null;
		
		if(m.getName().equals("testLoginData")) {
		data = new Object[2][2];
		
		data[0][0]= "Prasad";
		data[0][1]= "Makad@123";
		
		data[1][0]= "Shweta";
		data[1][1]= "Manjar@123";
		
		}else if(m.getName().equals("testSignupData")){
			
			data = new Object[2][3];
			
			data[0][0]= "Prasad";
			data[0][1]= "Thakare";
			data[0][2]= "Makad@gmail.com";
			
			data[1][0]= "Shweta";
			data[1][1]= "Shinde";
			data[1][2]= "Manjar@gmail.com";
			
		}
		
		return data;
	}
}
