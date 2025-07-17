package testpackage1;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void getSwappedNumbers(int num1, int num2) {
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After swapping - Number 1 is : "+num1);
		System.out.println("After swapping - Number 2 is : "+num2);
	}

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Your Numbers : ");
		int num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		sc1.close();

		getSwappedNumbers(num1, num2);
	}
}
