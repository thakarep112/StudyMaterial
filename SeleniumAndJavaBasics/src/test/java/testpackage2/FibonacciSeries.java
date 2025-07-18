package testpackage2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void getFibonacciSeries(int fiboSeriesLength) {

		int[] series = new int[fiboSeriesLength];
		series[0] = 0;
		series[1] = 1;

		for (int i = 2; i < fiboSeriesLength; i++) {

			series[i] = series[i - 2] + series[i - 1];
		}

		System.out.println("Printing Fibonacci series for the length : " + fiboSeriesLength);

		for (int i = 0; i < fiboSeriesLength; i++) {

			System.out.println(series[i]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Fibonacci Series Length : ");
		int fiboSeriesLength = sc.nextInt();
		sc.close();

		getFibonacciSeries(fiboSeriesLength);

	}
}
