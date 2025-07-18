package testpackage1;

import java.util.Scanner;
import java.lang.StringBuilder;

public class PalindromeString {
	
	public static boolean checkPalindromeString(String actualString) {
		
		String reversedString = "";
		
		reversedString = new StringBuilder(actualString).reverse().toString();
		
		/*
		 * for(int i=actualString.length()-1; i>=0; i--) {
		 * 
		 * reversedString = reversedString + actualString.charAt(i); }
		 */
		
		if(actualString.equalsIgnoreCase(reversedString)) {
			
			System.out.println(actualString + " is a palindrome string");
			return true;
		}else {
			
			System.out.println(actualString + " is not a palindrome string");
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String");
		String inputString = sc.nextLine();
		sc.close();
		
		checkPalindromeString(inputString);
	}
}
