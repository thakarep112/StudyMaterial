package impprograms;

//Write a Java Program to check if a number is Prime or not.

public class PrimeNumberExample {
	
	public static boolean validatePrimeNumber(int number) {
		
		if(number <=1) {
			
			System.out.println(number +" is not a Prime number");
			return false;
		}else {
			
			for(int i=2; i<number; i++) {
				
				if(number % i == 0) {

		    System.out.println(number +" is not a Prime number");
				return false;
				}
			}
			
			System.out.println(number +" is a Prime number");
			return true;
		}		
	}
	
	public static void main(String[] args ) {
		
		validatePrimeNumber(71);
	}
}
