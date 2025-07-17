package testpackage1;

import java.util.Scanner;

public class ReverseString {

	public static void getReverseString(String actualString) {

		String reversedString = "";
		int length = actualString.length();

		for (int i = length - 1; i >= 0; i--) {

			reversedString = reversedString + actualString.charAt(i);
		}

		System.out.println("Reversed string is: " + reversedString);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String: ");
		String inputString = sc.nextLine();
		sc.close();

		getReverseString(inputString);
	}
}
