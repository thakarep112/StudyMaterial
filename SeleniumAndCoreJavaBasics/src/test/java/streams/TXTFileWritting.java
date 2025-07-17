package streams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TXTFileWritting {

	public static void main(String[] args) throws IOException {
		
		// Stream Connectivity- Chaining 1 step with another by using reference variables.
		// Output Stream to select directory.
		// Creating object of File class & importing File class.
		// Constructor of this class accepts path & name to create file.
		
		File f = new File("C:\\Users\\pthakare\\Selenium Testing\\File Writing\\mytxtfile.txt");
		
		// Creating object of File Writer class & importing File class.
		// Handling IOException. 
		// Output Stream to write files & Chaining it to previous step.
		// If we are passing true/false along with chaining in constructor argument then it will append the file based on value.
		// false- To override file with updated details. true- To append file with updated details.
		
		FileWriter fw = new FileWriter(f,false); 
		
		// Creating object of Buffered Writer class & importing Buffered Writer class.
		// Chaining Buffered Writer to previous step to write in the file.

		BufferedWriter writer = new BufferedWriter(fw);
		
		// Writing inside the TXT file.
		
		writer.newLine();
		writer.write("Prasad");
		writer.newLine();
		writer.write("Ganesh");
		writer.newLine();
		writer.write("Thakare");
		writer.newLine();
		writer.write("CeX");
		writer.newLine();
		writer.write("NA");
		writer.newLine();
		writer.write("Vasind");
		
		// Closing stream
		
		writer.close();
		
		System.out.println("File has been created !!!");


	}

}
