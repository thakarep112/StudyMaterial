package impprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindOccurenceOfEachStringCharacter {
	
	public static void getOccurenceOfEachStringCharacter(String actualString) {
		
		Map<Character, Integer> hash_map = new HashMap<Character, Integer>();
		
		char [] charArray = actualString.toCharArray();
		
		for(char c : charArray) {
			
			if(hash_map.containsKey(c)) {
				
				hash_map.put(c, hash_map.get(c)+1);
			}else {
				
				hash_map.put(c, 1);
			}	
		}
		
		Set<Character> keys = hash_map.keySet();
		
		for(char c : keys) {
			
			System.out.println(c+" character count is "+hash_map.get(c));
		}	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String str = sc.nextLine();
		sc.close();
		
		getOccurenceOfEachStringCharacter(str);
	}
}
