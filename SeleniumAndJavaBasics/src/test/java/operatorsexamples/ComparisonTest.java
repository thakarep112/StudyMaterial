package operatorsexamples;

public class ComparisonTest {

	public static void main(String[] args) {

		String s1 = "Prasad";
		String s2 = "Prasad";
		
		// Comparing content store in reference variable s1 & s2.
		
		System.out.println(s1==s2);        
		System.out.println(s1.equals(s2)); // Correct to compare content.
		
		String s3 = new String("Thakare");
		String s4 = new String("Thakare");
		
		// Comparing objects store in reference variables s3 & s4.
		// Both s3 & s4 references pointing towards different object addresses.
		
		System.out.println(s3==s4);         // Correct to compare object addresses.
		System.out.println(s3.equals(s4));  // Incorrect to compare object addresses.
		
		// Calling static method from SingleTonDesignPattern class.
		
		SingleTonDesignPattern s5 = SingleTonDesignPattern.getInstance();
		SingleTonDesignPattern s6 = SingleTonDesignPattern.getInstance();
		
		// Comparing objects store in reference variables s5 & s6.
		// Both s5 & s6 references pointing towards same object address.
		
		System.out.println(s5==s6);        // Correct to compare object addresses.
		System.out.println(s5.equals(s6)); // Incorrect to compare object addresses.
		System.out.println(s5);
		System.out.println(s6);

	}

}
