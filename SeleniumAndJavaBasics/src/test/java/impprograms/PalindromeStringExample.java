package impprograms;

import java.util.Scanner;

public class PalindromeStringExample {

	public static boolean palindromeString(String actualString) {

		String reversedString = "";

		reversedString = new StringBuilder(actualString).reverse().toString();

		if (actualString.equalsIgnoreCase(reversedString)) {

			System.out.println(actualString + " is a Palindrome string.");
			return true;

		} else {

			System.out.println(actualString + " is not a Palindrome string.");
			return false;
		}
	}

	public static void main(String[] args) {

		String inputString;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		inputString = sc.nextLine();
		
		palindromeString(inputString);
	}
}
