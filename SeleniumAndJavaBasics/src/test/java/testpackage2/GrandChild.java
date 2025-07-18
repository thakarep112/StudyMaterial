package testpackage2;

public class GrandChild extends Child {

	public GrandChild() {

		super.getStatus();
		System.out.println("GrandChild - Default Constructor");
	}

	public GrandChild(String name) {

		System.out.println("GrandChild - Parameterized Constructor " + name);
	}

	public void getStatus() {

		System.out.println("GrandChild - getStatus");
	}

	public static void main(String[] args) {

		// GrandChild gc = new GrandChild();
		Parent p = new GrandChild();
	}

}
