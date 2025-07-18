package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReading {

	public static void main(String[] args) throws IOException {
		
		// Stream Connectivity- Chaining 1 step with another by using reference variables.
		// Input Stream for selecting files from a directory.
		// Creating object of File class & importing File class.
		// Constructor of this class accepts path & name to read the file.
		
		File f = new File("C:\\Users\\pthakare\\Selenium Testing\\File Writing\\mycsvfile.csv");
		
		// Creating object of File Reader class & importing File Reader class.
		// Handling IOException. 
		// Input Stream to read the file & Chaining it to previous step.
		
		FileReader fr = new FileReader(f); 
		
		// Creating object of Buffered Reader class & importing Buffered Reader class.
		// Buffered Reader to read character and chaining it to previous step.

		BufferedReader reader = new BufferedReader(fr);
		
		// Reading from the CSV file using loop.
		
		String line = null;
		
		while((line=reader.readLine())!=null) {
			
			System.out.println(line);
			
		}
		
		// Closing the last stream.
		
		reader.close();
		
		System.out.println("CSV File has been successfully readed !!!");


	}

}
