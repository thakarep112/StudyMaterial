package operatorsexamples;

public class SingleTonDesignPattern {
	
	// CreatingpPrivate static variable to create object.
	
	private static SingleTonDesignPattern instance = new SingleTonDesignPattern();
	
	// Private constructor 
	
	private SingleTonDesignPattern() {
		
		System.out.println("Creating an Object");
	}
	
	// Creating static method with return type as className.
	
	public static SingleTonDesignPattern getInstance() {
		
		return instance;
	}

}
