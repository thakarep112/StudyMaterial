package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TXTFileReading {

	public static void main(String[] args) throws IOException {
		
		// Stream Connectivity- Chaining 1 step with another by using reference variables.
		// Input Stream for selecting files from a directory.
		// Creating object of File class & importing File class.
		// Constructor of this class accepts path & name to read the file.
		
		File f = new File("C:\\Users\\pthakare\\Selenium Testing\\File Writing\\mytxtfile.txt");
		
		// Creating object of File Reader class & importing File Reader class.
		// Handling IOException. 
		// Input Stream to read the file & Chaining it to previous step.
		
		FileReader fr = new FileReader(f); 
		
		// Creating object of Buffered Reader class & importing Buffered Reader class.
		// Buffered Reader to read character and chaining it to previous step.

		BufferedReader reader = new BufferedReader(fr);
		
		// Reading from the TXT file.
		// To read single single line of the file.
		
		System.out.println(reader.readLine());
		
		// Reading complete file using loop.
		
		String line = null;
		while((line=reader.readLine())!= null) {
			
			System.out.println(line);
		}
		
		// Closing the last stream.
		
		reader.close();
		
		System.out.println("TXT File has been successfully readed !!!");

	}

}
