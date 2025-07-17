package propertiesfilereading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReading {
	
	// Property file is created as- 'New/Other/General/File' with file name extension as .properties 

	public static void main(String[] args) throws IOException {

		//Class - Properties. We need to import this class in order to it in your project along with throws declaration FileNotFoundException.
		
		Properties prop = new Properties();
		
		// To read file we used FileInputStream class. We need to import this class in order to it in your project. 
		// This class having is constructor with object.properties file path as an argument.
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\propertiesfilereading\\object.properties");
		
		// To load the file we used load method from Properties class which accepts input stream as an argument.
		// We need to add throws declaration IOException to used this method.
		
		prop.load(fis);
		
		// To get property/data from the file we used get method from Properties class which accepts key from object.properties file as an argument to get the data stored in that key.
		
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Last_Name"));
		System.out.println(prop.getProperty("Company"));
		System.out.println(prop.getProperty("Employee_ID"));
		
		// To fetch the current directory of your project we used below method.
		
		System.out.println(System.getProperty("user.dir"));
	}

}
