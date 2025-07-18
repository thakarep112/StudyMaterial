package testpackage1;

import java.util.Scanner;

public class SumOfAllDigitsOfGivenInteger {
	
	
	public static int getSumOfAllIntegers(int num) {
		
		int givenInteger = num;
		int sum=0;
		
		while(num > 0) {
			
			int n = num%10;
			sum = sum + n;
			num = num/10;
		}
		
		System.out.println("Sum of all the integers of " +givenInteger + " is : "+sum);
		return sum;		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		sc.close();
		
		getSumOfAllIntegers(num);
	}
}
