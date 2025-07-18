package testpackage2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountOccurrenceOfEachWordFromString {
	
	public static void getCountOfEachStringCharacter(String inputString) {
		
		inputString = inputString.replace(" ", "");
		
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		char[] charArray = inputString.toCharArray();
		
		for(char c : charArray) {
			
			if(hashMap.containsKey(c)) {
				
				hashMap.put(c, hashMap.get(c)+ 1);
				
			}else {
				
				hashMap.put(c, 1);
			}
		}
		
		Set<Character> keys = hashMap.keySet();
		
		for(char c : keys) {
			
			System.out.println("Count of character - "+c +" is : "+hashMap.get(c));	
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String: ");
		String str = sc.nextLine();
		sc.close();
		
		getCountOfEachStringCharacter(str);

	}
}
