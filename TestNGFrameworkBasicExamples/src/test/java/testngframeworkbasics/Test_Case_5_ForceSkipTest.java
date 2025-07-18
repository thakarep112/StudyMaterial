package testngframeworkbasics;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test_Case_5_ForceSkipTest extends BaseTest{
	
	@Test
	public void skipTest() {
		
		throw new SkipException("Skipping this case forfully to test SkipException() scenario");
		
	}

}
