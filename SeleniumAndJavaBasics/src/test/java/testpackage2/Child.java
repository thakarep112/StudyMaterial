package testpackage2;

public class Child extends Parent {

	public Child() {

		System.out.println("Child - Default Constructor");
	}

	public Child(String name) {

		System.out.println("Child - Parameterized Constructor " + name);
	}

	public static void main(String[] args) {

		// Child c1 = new Child("Ram");
		// Child c2 = new Child();
		// Parent p1 = new Parent();
		// Parent p2 = new Parent("Shyam");

	}

}
