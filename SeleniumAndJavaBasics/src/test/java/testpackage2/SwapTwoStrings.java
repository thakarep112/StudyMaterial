package testpackage2;

import java.util.Scanner;

public class SwapTwoStrings {
	
	public static void getSwappedStrings(String str1, String str2) {
		
		str1= str1 + str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("After swapping the Strings, str1 is : "+str1);
		System.out.println("After swapping the Strings, str2 is : "+str2);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter str1 and str2");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();

		getSwappedStrings(str1, str2);
	}
}
