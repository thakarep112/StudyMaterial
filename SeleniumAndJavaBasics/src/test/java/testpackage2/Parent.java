package testpackage2;

public class Parent {

	public Parent() {

		System.out.println("Parent - Default Constructor");
	}

	public Parent(String name) {
		
		System.out.println("Parent - Parameterized Constructor "+name);
	}
	
	public void getStatus() {
		
		System.out.println("Parent - getStatus");
	}
}
