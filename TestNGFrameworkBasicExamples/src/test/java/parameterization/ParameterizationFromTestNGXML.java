package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Getting parameters from TestNG XML file. Need to run this test from XML file itself in which parameters are provided.
public class ParameterizationFromTestNGXML {
	
	@Parameters({"env", "browser"})
	@Test
	public static void getEnvAndBrowser(String env, String browser) {
		
		System.out.println(env+"-----"+browser);
		
	}

}
