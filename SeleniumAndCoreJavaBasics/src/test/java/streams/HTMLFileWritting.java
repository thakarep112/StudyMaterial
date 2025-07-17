package streams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLFileWritting {

	public static void main(String[] args) throws IOException {
		
		// Stream Connectivity
		// Output Stream to select directory.
		
		File f = new File("C:\\Users\\pthakare\\Selenium Testing\\File Writing\\myhtmlfile.html");
		
		// Output Stream to write files & Chaining it to previous step.
		
		
		FileWriter fw = new FileWriter(f,false); 
		
		// Chaining Buffered Writer to previous step to write in the file.

		BufferedWriter writer = new BufferedWriter(fw);
		
		// Writing inside the HTML file.
		
		writer.write("<html><body><title>udemy.com</title><h1>Learning JAVA from udemy</h1></body></html>");
		
		// Closing stream
		
		writer.close();
		
		System.out.println("File has been created !!!");


	}

}
