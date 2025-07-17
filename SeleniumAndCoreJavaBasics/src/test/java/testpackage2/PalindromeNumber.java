package testpackage2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void getPalindromeNumber(int num) {

		int actualNumber = num;
		int reversedNumber = 0;
		
		while(num != 0) {
			
			int n = num%10;
			reversedNumber = (reversedNumber * 10) + n;
			num = num/10;
		}

		if (reversedNumber == actualNumber) {

			System.out.println(actualNumber +" is a palindrome number");
		} else {

			System.out.println(actualNumber +" is not a palindrome number");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		sc.close();

		getPalindromeNumber(num);
	}
}
