package testpackage2;

import java.util.Scanner;

public class ArrayBubbleSorting {

	public static void getBubbleSortArray(int[] array) {

		int size = array.length;
		int temp = 0;

		System.out.println("Array values before sorting :");
		
		for (int i = 0; i < size; i++) {

			System.out.println(array[i]);
		}

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size-i-1; j++) {
				
				if(array[j] > array[j+1]) {
					
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("Array values after sorting :");

		for (int i = 0; i < size; i++) {

			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Please enter " + size + " integer values : ");

		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();
		}
		
		sc.close();

		getBubbleSortArray(array);
	}
}
