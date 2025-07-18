package impprograms;

//Write a Java Program to swap two given Strings.

public class SwapStringExample {

	public static void main(String[] args) {

		String S1 = "David";
		String S2 = "Warner";
		
		S1 = S1 + S2;
		S2=S1.substring(0, S1.length() - S2.length());
		S1=S1.substring(S2.length());
		
		System.err.println("New value of String S1: "+S1);
		System.err.println("New value of String S2: "+S2);
	}
}
