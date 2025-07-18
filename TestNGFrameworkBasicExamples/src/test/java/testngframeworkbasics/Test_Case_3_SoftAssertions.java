package testngframeworkbasics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Case_3_SoftAssertions extends BaseTest{
	
	@Test
	public void validateImageUNTitle() {
		
		// Using Sort Assertions to execute all the validations within single Test even if any intermediate validation is failing
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("Beginning of Validations");

		System.out.println("First Validation: Validating Image");
		softAssert.assertEquals(false, true, "Image Mismatched");
		
		System.out.println("Second Validation: Validating UN");
		softAssert.assertTrue(false, "UN Mismatched");
		
		System.out.println("Third Validation: Validating Title");
		String expectedResult = "Webuy.com";
		String actualResult = "Google.com";
		softAssert.assertEquals(actualResult, expectedResult, "Title Mismatched");
		
		System.out.println("Ending of Validations");
		
		// Using assertAll() at the end of the Test to display all the failed validations of the Test
		softAssert.assertAll();
	}

}
