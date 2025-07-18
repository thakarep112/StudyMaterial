package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Passing parameters from excel using ExcelReader utility
public class ParameterizationFromExcel {

	public static ExcelReader excel = null;

	@Test(dataProvider = "getExcelData")
	public void testNGExcelParameterization(String userName, String password, String age) {
		
		System.out.println(userName+"----"+password+"----"+age);

	}

	@DataProvider
	public Object getExcelData() {

		if (excel == null) {

			excel = new ExcelReader("C:\\Users\\pthakare\\Selenium Testing\\TestNG\\testNGData.xlsx");

		}
		
		String sheetName = "loginData";
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
