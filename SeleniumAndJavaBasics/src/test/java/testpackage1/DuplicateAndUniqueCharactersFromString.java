package testpackage1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateAndUniqueCharactersFromString {

	public static void getDuplicateAndUniqueCharacters(String inputString) {

		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		char[] charArray = inputString.toCharArray();

		for (char c : charArray) {

			if (hashMap.containsKey(c)) {

				hashMap.put(c, hashMap.get(c) + 1);
			} else {

				hashMap.put(c, 1);
			}
		}

		Set<Character> keys = hashMap.keySet();

		for (char c : keys) {

			if (hashMap.get(c) > 1) {

				System.out.println("Duplicate character ---> " + c + " <--- and its values is : " + hashMap.get(c));
			} else {

				System.out.println("Unique character ---> " + c + " <--- and its values is : " + hashMap.get(c));
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String inputString = sc.nextLine();
		sc.close();

		getDuplicateAndUniqueCharacters(inputString);
	}
}
