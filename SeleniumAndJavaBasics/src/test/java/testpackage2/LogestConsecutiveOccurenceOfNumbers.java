package testpackage2;

import java.util.Scanner;

public class LogestConsecutiveOccurenceOfNumbers {
	
	public static int getLogestConsecutiveOccurenceOfNumbers(int[] array) {
		
		int size = array.length;
		int count =0;
		int max =0;
		
		for(int i=0; i<size-1; i++) {
			
			if(array[i+1] == array[i]+1) {
				
				count++;
			}else {
				
				count=0;
			}
			
			max = Math.max(max, count+1);
		}
		
		System.out.println("The logest consecutive occurence of numbers are : " +max);
		return max;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("Please enter "+size +" integer numbers : ");
		for(int i=0; i<size; i++) {
			
			array[i] = sc.nextInt();
		}
		
		sc.close();

		getLogestConsecutiveOccurenceOfNumbers(array);
	}
}
