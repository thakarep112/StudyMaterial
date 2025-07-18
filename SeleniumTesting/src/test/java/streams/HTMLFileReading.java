package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HTMLFileReading {

	public static void main(String[] args) throws IOException {
		
		// Stream Connectivity
		// Input Stream for selecting files from a directory.
		
		File f = new File("C:\\Users\\pthakare\\Selenium Testing\\File Writing\\myhtmlfile.html");
		 
		// Input Stream to read the file & Chaining it to previous step.
		
		FileReader fr = new FileReader(f); 
		
		// Buffered Reader to read character and chaining it to previous step.

		BufferedReader reader = new BufferedReader(fr);
		
		// Reading from the HTML file using.
		
		System.out.println(reader.readLine());
		
		// Closing the last stream.
		
		reader.close();
		
		System.out.println("HTML File has been successfully readed !!!");


	}

}
