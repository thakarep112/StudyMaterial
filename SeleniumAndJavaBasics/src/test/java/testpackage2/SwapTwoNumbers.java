package testpackage2;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void getSwappedNumbers(int num1, int num2) {
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swapping the numbers, num1 is : "+num1);
		System.out.println("After swapping the numbers, num2 is : "+num2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 and num2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		getSwappedNumbers(num1,num2);
	}
}
