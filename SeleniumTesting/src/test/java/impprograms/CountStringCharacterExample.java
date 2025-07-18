package impprograms;

import java.util.HashMap;
import java.util.Map;

//Write a Java Program to count the number of characters in a given String.

public class CountStringCharacterExample {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static int getStringCharCount(String inputString) {
		
		Map<Integer,Character> stringChar = new HashMap();
		
		for(int i=0; i<inputString.length(); i++) {
			
			stringChar.put(i+1, inputString.charAt(i));
		}
		
		int count = stringChar.size();
		return count;	
	}

	public static void main(String[] args) {
	
		System.out.println("Total number of characters present in given String are : "+getStringCharCount("rahulshettyacademy"));
	}
}
