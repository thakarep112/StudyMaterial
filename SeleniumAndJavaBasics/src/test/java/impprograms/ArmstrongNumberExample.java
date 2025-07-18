package impprograms;

import java.util.Scanner;

// Write a Java Program to check if a number is Armstrong number or not.

public class ArmstrongNumberExample {

	public static void main(String[] args) {

		int number;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		number = sc.nextInt();
		
		int actualNumber = number;
		double result =0;
		
		while(actualNumber != 0) {
			
			int n = actualNumber % 10;
			result = result + Math.pow(n, 3);
			actualNumber = actualNumber / 10;
		}
		
		if(number == result) {
			
			System.out.println(number+ " is an Armstrong number");
		}else {
			
			System.out.println(number+ " is not an Armstrong number");
		}
	}
}
