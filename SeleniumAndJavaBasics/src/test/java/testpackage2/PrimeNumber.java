package testpackage2;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void getPrimeNumber(int num) {
		
		boolean isPrimeNumber = true;
		
		if(num<=1) {
			
			isPrimeNumber = false;
		}else {
			
			for(int i=2; i<= Math.sqrt(num); i++) {
				
				if(num % i ==0) {
					
					isPrimeNumber = false;
					break;
				}
			}	
		}
		
		if(isPrimeNumber) {
			
			System.out.println(num +" is a Prime Number");
		}else {
			
			System.out.println(num +" is not a Prime Number");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int num = sc.nextInt();
		sc.close();
		
		getPrimeNumber(num);
	}
}
