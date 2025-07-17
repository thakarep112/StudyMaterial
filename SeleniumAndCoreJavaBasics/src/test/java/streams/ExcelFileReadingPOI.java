package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileReadingPOI {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// Stream connectivity.
		// Input file stream.

		File f = new File("C:\\Users\\pthakare\\Selenium Testing\\File Writing\\myxlsxfile.xlsx");

		// Connecting to Input Stream.

		FileInputStream fis = new FileInputStream(f);

		// Connecting workbook to Input Stream.

		Workbook workbook = WorkbookFactory.create(fis);

		// Getting the 1st sheet of excel.

		Sheet sheet0 = workbook.getSheetAt(0);

		// Getting 1st Row to read the data.

		Row row0 = sheet0.getRow(0);

		// Getting Cells to read the data from the 1st Row.

		Cell cellA = row0.getCell(0);
		Cell cellB = row0.getCell(1);
		Cell cellC = row0.getCell(2);

		// Printing the data available in above Cells.

		System.out.println(cellA);
		System.out.println(cellB);
		System.out.println(cellC);

		// Reading the excel sheet using Enhanced for loop.

		for (Row row : sheet0) {

			for (Cell cell : row) {

				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				case BLANK:
					System.out.print("Blank" + "\t");
					break;
				default:
					break;
				}

			}

			System.out.println();

		}

		// Closing streams

		fis.close();

	}

}
