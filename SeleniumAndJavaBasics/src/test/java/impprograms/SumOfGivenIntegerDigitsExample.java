package impprograms;

// Write a Java Program to print the sum of digits of a given integer.

public class SumOfGivenIntegerDigitsExample {
	
	public static int getSumOfAllIntegerDigits(int number) {
		
		int sum = 0;
		
		while(number != 0) {
			
			int n = number % 10;
			sum = sum + n;
			number = number / 10;
		}
		
		return sum;
		
	}

	public static void main(String[] args) {	
		
		System.out.println("Sum of digits of a given integer is : "+getSumOfAllIntegerDigits(153));
	}
}
