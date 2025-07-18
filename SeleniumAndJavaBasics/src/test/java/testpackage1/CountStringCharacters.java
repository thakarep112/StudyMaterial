package testpackage1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountStringCharacters {
	
	public static void getStringCharacterCount(String str) {
		
		int count =0;
		int size = str.length();
		Map<Integer, Character> hashMap = new HashMap<Integer, Character>();
		
		for(int i=0; i<size; i++) {
			
			hashMap.put(i+1, str.charAt(i));
		}
		
		count = hashMap.size();
		System.out.println("Total characters present in a String - "+str + " = " +count);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String inputString = sc.nextLine();
		sc.close();

		getStringCharacterCount(inputString);
	}

}
