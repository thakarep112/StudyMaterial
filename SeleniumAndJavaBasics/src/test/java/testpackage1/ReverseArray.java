package testpackage1;

import java.util.Scanner;

public class ReverseArray {

	public static void getReverseArray(int [] array) {

		int size = array.length;
		
		System.out.println("Reverse array values are : ");
		for (int i = size-1; i >= 0; i--) {

			System.out.print(array[i] +" ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] inputArray = new int[size];

        System.out.println("Enter " +size + " integer numbers :");
        for (int i=0; i<size; i++) {
        	inputArray[i] = sc.nextInt();
        }
        
        sc.close();
        
        getReverseArray(inputArray);
	}
}
