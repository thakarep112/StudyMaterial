package basicsexamples;

public class IfElseStatements {

	public static void main(String[] args) {

		int num= (int)(Math.random()*100);
		System.out.println(num);
		
		if(num>75) {
			System.out.println(num+" Number is greater than 75");
		}
		else if(num<=75 && num>=35 ) {
			System.out.println(num+" Number is in range of 35 to 75");
		}
		else {
			System.out.println(num+" Number is below 35");
		}
		
	}

}
