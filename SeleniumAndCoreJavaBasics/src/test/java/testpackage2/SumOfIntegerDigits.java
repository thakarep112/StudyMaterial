package testpackage2;

import java.util.Scanner;

public class SumOfIntegerDigits {
	
	public static int getSumOfIntegerDigits(int num) {
		
		int sum=0;
		
		while(num !=0) {
			
			int n = num%10;
			sum= sum + n;
			num=num/10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		sc.close();

		System.out.println("Sum of all the digits of "+num +" is " +getSumOfIntegerDigits(num));
	}
}
