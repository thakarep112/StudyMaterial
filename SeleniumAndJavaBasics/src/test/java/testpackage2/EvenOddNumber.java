package testpackage2;

import java.util.Scanner;

public class EvenOddNumber {
	
	public static void getEvenOddNumber(int num) {
		
		if(num<=1) {
			
			System.out.println(num +" is neither Even nor Odd number");
		}else if(num%2==0) {
			
			System.out.println(num +" is an Even number");
		}else {
			
			System.out.println(num +" is an Odd number");
		}	
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		sc.close();

		getEvenOddNumber(num);
	}
}
