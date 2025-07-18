package testpackage2;

import java.util.Scanner;

public class CountCapitalWordsFromString {
	
	
	public static int getCapitalLetters(String inputString ) {
		
		int count =0;
		int size = inputString.length();
		
		for(int i=0; i<size; i++) {
			
			if(inputString.charAt(i)>='A' && inputString.charAt(i)<='Z') {
				
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String str = sc.nextLine();
		sc.close();
		
		System.out.println("Total capital words are : "+getCapitalLetters(str));

	}
}
