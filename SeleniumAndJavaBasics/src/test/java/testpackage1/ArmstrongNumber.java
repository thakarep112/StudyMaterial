package testpackage1;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void validateArmstrongNumber(int number) {
		
		int actualNumber = number;
		double result=0;
		
		while(actualNumber != 0) {
			
			int n = actualNumber%10;
			result = result + Math.pow(n, 3);
			actualNumber = actualNumber/10;	
		}
		
		if(result == number) {
			
			System.out.println(number +" is an Armstrong number");
			
		}else {
			
			System.out.println(number +" is not an Armstrong number");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int number = sc.nextInt();
		sc.close();
		
		validateArmstrongNumber(number);
	}
}
