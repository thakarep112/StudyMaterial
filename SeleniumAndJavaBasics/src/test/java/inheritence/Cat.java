package inheritence;

public class Cat extends Animal {

	public void getColor() {

		System.out.println("White Color");

	}

	public static void main(String[] args) {

		Cat c = new Cat();
		c.getSound();
		c.getColor();

	}

}
