package testpackage2;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void getArmstrongNumber(int num) {
		
		int numDigits =String.valueOf(num).length();
		int actualNumber = num;
		double result = 0;
		
		while(num != 0) {
			
			int n = num%10;
			result = result + Math.pow(n, numDigits);
			num= num/10;	
		}
		
		if(result == actualNumber) {
			
			System.out.println(actualNumber +" is an Armstrong number");
		}else {
			
			System.out.println(actualNumber +" is not an Armstrong number");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		sc.close();
		
		getArmstrongNumber(num);
	}
}
