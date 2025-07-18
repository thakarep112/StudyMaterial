package impprograms;

import java.util.Scanner;

//Write a Java Program to print the Fibonacci Series. 

public class FibonacciSeriesExample {

	public static void main(String[] args) {

		int fiboSeriesLength;
		
		 @SuppressWarnings("resource") 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Fibonacci Series Length : "); 
		 fiboSeriesLength = sc.nextInt();
		
		int num[] = new int[fiboSeriesLength];
		num[0] = 0;
		num[1] = 1;
		
		for(int i=2; i<fiboSeriesLength; i++) {

			num[i] = num[i-1] + num[i-2];
		}
		
		System.out.println("Fibonacci Series : ");
		
		for(int i=0; i<fiboSeriesLength; i++) {

			System.out.println(num[i]+ " ");
		}
	}
}
