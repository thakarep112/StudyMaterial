package impprograms;

import java.util.Scanner;

public class PalindromeNumberExample {
	
	public static boolean palindromeNumber(int num) {
		
		int actualNumber = num;
		int reversedNumber = 0;
		
		while(num > 0) {
			
			int n= num%10;
			reversedNumber = reversedNumber * 10 + n;
			num=num/10;
		}
		
		if(actualNumber == reversedNumber) {
			
			System.out.println(actualNumber+ " is a Palindrome number.");
			return true;
			
		}else {
			
			System.out.println(actualNumber+ " is not a Palindrome number.");	
			return false;
		}
	}

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		number = sc.nextInt();
		sc.close();
		
		palindromeNumber(number);
		
	}
}
	
