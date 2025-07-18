package streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWritingPOI {

	public static void main(String[] args) throws IOException {

		// Creating the Workbook using XSSFWorkbook class.
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// Creating Sheet using XSSFSheet class in the above workbook.
		
		XSSFSheet sheet0 = workbook.createSheet("sheet1");
		
		// Creating Row using XSSFRow class in the above sheet.

		XSSFRow row0 = sheet0.createRow(0);
		  
		// Creating Cells using Cell class in the above rows.
		  
		  Cell cellA = row0.createCell(0); 
		  Cell cellB = row0.createCell(1);
		  Cell cellC = row0.createCell(2);

		  
		// Setting the values inside the above Cells.
		  
		  cellA.setCellValue("Prasad"); 
		  cellB.setCellValue("Ganesh");
		  cellC.setCellValue("Thakare");
		 
		
			
		// Creating Rows & Cells using loop & setting values for created cells.
			 
			 for(int rows=1; rows<10; rows++) 
			   { 
				 XSSFRow row = sheet0.createRow(rows);
			 
			    for(int col=0; col<3; col++) 
			      { 
			    	Cell cell = row.createCell(col);
			        cell.setCellValue((int)(Math.random()*100));
			 
			      }
			  
			   }
			 
		
		// Stream Connectivity
		
		File f = new File("C:\\Users\\pthakare\\Selenium Testing\\File Writing\\myxlsxfile.xlsx");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		workbook.write(fos);
		
		// Closing streams
		
		workbook.close();
		
		System.out.println("File has been successfully created");

	}

}
