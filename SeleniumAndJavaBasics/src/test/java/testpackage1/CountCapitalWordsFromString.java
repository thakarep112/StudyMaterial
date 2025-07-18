package testpackage1;

import java.util.Scanner;

public class CountCapitalWordsFromString {

	public static int getCapitalWordsCount(String inputString) {

		int count = 0;

		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {

				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String inputString = sc.nextLine();
		sc.close();

		System.out.println("Capital words present is the given String ---> " + inputString + " <--- are : "
				+ getCapitalWordsCount(inputString));
	}
}
