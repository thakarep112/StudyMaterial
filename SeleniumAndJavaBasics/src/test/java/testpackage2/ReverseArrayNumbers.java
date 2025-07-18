package testpackage2;

import java.util.Scanner;

public class ReverseArrayNumbers {
	
	public static void getReverseArray(int[] array){
		
		int size = array.length;
		
		System.out.println("Printing forward array numbers : ");
		for(int i=0; i<size; i++) {
			
			System.out.println(array[i]);
		}
		
		System.out.println();
		System.out.println("Printing reverse array numbers : ");
		for(int i=size-1; i>=0; i--) {
			
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array length : ");
		int size = sc.nextInt();

		int[] array = new int[size];
		System.out.println("Please enter " + size + " integer numbers : ");
		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();
		}

		sc.close();

		getReverseArray(array);
	}
}
