package inheritence;

public class Dog extends Animal {
	
	public void getSound() {
		
		System.out.println("Bhoww Bhoww");
		
	}

	public static void main(String[] args) {

		Dog d = new Dog();
		d.getSound();
		d.getColor();
		
	}

}
