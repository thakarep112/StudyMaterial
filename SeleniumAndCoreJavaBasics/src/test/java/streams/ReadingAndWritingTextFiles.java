package streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingAndWritingTextFiles {

	public static void main(String[] args) throws IOException {

		// Creating Text file
		File f = new File("C:\\Users\\pthakare\\Selenium Testing\\File Writing\\mytextfile.txt");
		f.createNewFile();
		
		// Writing inside the Text file.
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write("This is 1st line of the file !!!");
		writer.newLine();
		writer.write("This is 2nd line of the file !!!");
		writer.close();
		System.out.println("File writing has been completed !!!");

		
		// Reading from the Text file.
		
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		System.out.println(reader.readLine());
		System.out.println(reader.readLine());
		
		// Reading file using loop.
		
		String line = null;
		while((line = reader.readLine())!= null) {
			
			System.out.println(line);
		}	
		
		reader.close();
		
		System.out.println("File reading has been completed !!!");

	}

}
