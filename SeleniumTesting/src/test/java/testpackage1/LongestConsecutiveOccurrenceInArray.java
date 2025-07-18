package testpackage1;

import java.util.Scanner;

public class LongestConsecutiveOccurrenceInArray {
	
	
	public static void getLongestConsecutiveOccurrence(int [] array) {
		
		int counter = 0;
		int max = 0;
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i]+1 == array[i+1]) {
				
				counter++;				
			}else {
				
				counter=0;
			}
			
           max = Math.max(max, counter+1);
		}
		
		System.out.println("Longest consecutive occurrence is : "+max);		
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
        
        getLongestConsecutiveOccurrence(inputArray);

	}
}
