package superkeyword;

public class Dog extends Animal {
	
	public Dog(String breed) {
		
		System.out.println("Constructor of "+breed);
	}
	
	public void getSound() {
		
		// Super keyword- 'super' keyword is used to call super class behavior of overridden method from child class.
		
		super.getSound();
		System.out.println("Dog sound !!!");
		
	}
}
