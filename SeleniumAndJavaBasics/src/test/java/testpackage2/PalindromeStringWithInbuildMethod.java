package testpackage2;

import java.util.Scanner;

public class PalindromeStringWithInbuildMethod {
	
	public static void getPalindromeString(String str) {
		
		String actualString = str; 
		String reversedString = new StringBuilder(str).reverse().toString();
		
		if(reversedString.equalsIgnoreCase(actualString)) {
			
			System.out.println(actualString+" is a palindrome string");	
			
		}else {
			
			System.out.println(actualString+" is not a palindrome string");
		}	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String str = sc.nextLine();
		sc.close();
		
		getPalindromeString(str);
	}
}
