package utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import base.BaseClass;

public class UtilityClass extends BaseClass {
	
	public static String screenshotName;	
	
	public static void captureScreenshot() throws IOException {
		
		Date d = new Date();
		d.toString().replace(":", "_").replace(" ", "_");
		screenshotName = "Failure_"+d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenshotName));
		
	}
	
	
	@DataProvider
	public Object dataProvider(Method m){
		
		String sheetName = m.getName();
		int rowCount = excel.getRowCount(sheetName);
		int columnCount = excel.getColumnCount(sheetName);


		Object[][] data = new Object[rowCount-1][columnCount];
		
		for(int rowNum=2; rowNum<=rowCount; rowNum++) {
			
			for(int colNum=0; colNum<columnCount; colNum++) {
				
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}

		return data;
		
	}

}
