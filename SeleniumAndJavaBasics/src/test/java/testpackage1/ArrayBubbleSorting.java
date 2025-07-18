package testpackage1;

import java.util.Scanner;

public class ArrayBubbleSorting {
	
	public static void sortArray(int[] inputArray) {
		
		int size = inputArray.length;
		int temp=0;
		
		
		System.out.println("Before Sorting Array is : ");
		for(int num : inputArray) {
			
			System.out.print(num + " ");
		}
		
		for(int i=0; i<size; i++) {
			
			for(int j=0; j<size-i-1; j++) {
				
				if(inputArray[j] > inputArray[j+1]) {
					
				temp = inputArray[j];
				inputArray[j] = inputArray[j+1];
				inputArray[j+1]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("After Sorting Array is : ");
		for(int num : inputArray) {
			
			System.out.print(num + " ");
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
        
        sortArray(inputArray);

	}
}
