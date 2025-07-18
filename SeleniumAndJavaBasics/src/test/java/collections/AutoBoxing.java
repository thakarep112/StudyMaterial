package collections;

public class AutoBoxing {

	public static void main(String[] args) {

		// Converting integer data type value into an Integer class object.
		
		int a = 50;
		@SuppressWarnings("removal")
		Integer obj1 = new Integer(a); // Wrapping --> AutoBoxing.
		System.out.println(obj1);
		
		// Converting integer class object into an Integer data type value.
		
		int b = obj1;          // Unwrapping --> AutoUnBoxing.
		System.out.println(b);
		
		// Converting double data type value into a double class object.
		
		double var = 10.0;
		@SuppressWarnings("removal")
		Double obj2 = new Double(var); // Wrapping --> AutoBoxing.
		System.out.println(obj2);
		
		// Converting double class object into a double data type value.
		
		Double d = obj2;        // Unwrapping --> AutoUnBoxing.
		System.out.println(d);
		
		//AutoBoxing
		int i=5;
		@SuppressWarnings("removal")
		Integer obj3 = new Integer(i);
		//AutoUnBoxing
		int j=obj3;
		System.out.println(j);
	}
}
