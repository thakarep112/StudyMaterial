package impprograms;

import java.util.Scanner;

public class EvenOddNumberExample {
	
	public static void getEvenOrOddNumber(int num) {
		
		if(num<=1) {
			
			System.out.println(num+ " is neither Even nor Odd number");
		}else if(num%2==0) {
			
			System.out.println(num+ " is Even number");
		}else {
			
			System.out.println(num+ " is Odd number");
		}	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		sc.close();
		getEvenOrOddNumber(num);
	}
}
