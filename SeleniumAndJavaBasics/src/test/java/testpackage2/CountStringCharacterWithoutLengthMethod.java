package testpackage2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountStringCharacterWithoutLengthMethod {

	public static void getStringCharacterCount(String str) {

		Map<Integer, Character> hashMap = new HashMap<Integer, Character>();

		for (int i = 0; i < str.length(); i++) {

			hashMap.put(i + 1, str.charAt(i));
		}
		
		int count = hashMap.size();
		
		System.out.println("Count of total characters present in the String - " +str +" is " +count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String :");
		String str = sc.nextLine();
		sc.close();

		getStringCharacterCount(str);
	}
}
