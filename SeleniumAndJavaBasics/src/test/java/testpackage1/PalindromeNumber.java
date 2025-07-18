package testpackage1;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean checkPalindromeNumber(int num) {
		
		int actualNumber = num;
		int reversedNumber = 0;
		
		while(num > 0) {
			
			int n = num%10;
			reversedNumber = (reversedNumber * 10) + n;
			num = num/10;
		}
		
		if(actualNumber == reversedNumber) {
			
			System.out.println(actualNumber + " is a palindrome number!!");			
			return true;	
			
		}else {
			
			System.out.println(actualNumber + " is not a palindrome number!!");
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int number = sc.nextInt();
		sc.close();
		
		checkPalindromeNumber(number);

	}
}
