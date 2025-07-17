package impprograms;

// Write a Java Program for swapping of 2 numbers.

public class SwapNumberExample {

	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		
		num1 = num1 + num2;
		
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("New value of num1 is: "+num1);
		System.out.println("New value of num2 is: "+num2);
	}
}
