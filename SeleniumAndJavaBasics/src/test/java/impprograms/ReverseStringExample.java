package impprograms;

//Write a Java Program to reverse a String.

public class ReverseStringExample {

	public static void main(String[] args) {
		
		String inputString = "DavidWarner";
		String outputString = "";
		
		for(int i=inputString.length()-1; i>=0; i--) {
			
			outputString = outputString + inputString.charAt(i) ;
		}
		
		System.out.println("Reverse String is: "+outputString);
	}
}
