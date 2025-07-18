package testpackage1;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void getFibonacciSeries(int fiboSeriesLength) {
		
		int num[] = new int[fiboSeriesLength];
		num[0] = 0;
		num[1] = 1;
		
		for(int i=2; i<fiboSeriesLength; i++) {
			
			num[i] = num[i-1] + num[i-2];
		}
		
		System.out.println("Fibonacci series for the length : "+fiboSeriesLength);
		
		for(int i=0; i<fiboSeriesLength; i++) {
			
			System.out.println(num[i]+ " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fibonacci Series Length : ");
		int fiboSeriesLength = sc.nextInt();
		sc.close();
		
		getFibonacciSeries(fiboSeriesLength);
	}
}
