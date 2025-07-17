package parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Passing parameters from excel in the form of Hash-table by using ExcelReader utility
public class ParameterizationFromExcel_HashTable {
	
	public static ExcelReader excel = null;

	@Test(dataProvider = "getExcelData")
	public void testNGExcelParameterization(Hashtable<String, String> data) {
		
            System.out.println(data.get("userName")+"-----"+data.get("password")+"-----"+data.get("age")+"-----"+data.get("place"));
	}

	@DataProvider
	public Object getExcelData() {

		if (excel == null) {

			excel = new ExcelReader("C:\\Users\\pthakare\\Selenium Testing\\TestNG\\testNGData_2.xlsx");

		}
		
		String sheetName = "loginData";
		int rowCount = excel.getRowCount(sheetName);
		int columnCount = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rowCount-1][1];
		
		Hashtable<String, String> table = null;
		
		for(int rowNum=2; rowNum<=rowCount; rowNum++) {
			
			table = new Hashtable<String, String>();
			
			for(int colNum=0; colNum<columnCount; colNum++) {
				
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum-2][0]= table;
				
			}
		}

		return data;

	}

}
