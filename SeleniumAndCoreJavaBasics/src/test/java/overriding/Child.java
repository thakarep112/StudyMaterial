package overriding;

public class Child extends Parent {
	
	// Changing access modifier of inherited method
	
	protected void show() {
		
		System.out.println("Show - Child()");
	}
	
	public void display() {
		
		System.out.println("Display - Child()");
	}
	
	public static void add() {   // Static method overriding- not possible.
		
		System.out.println("Add - Child()");
	}

	public static void main(String[] args) {
		
		Parent c = new Child();   // polymorphic reference
		c.show();   
		Child.add();
		Parent.add();
     // Any method which is present in child class but not there in parent, 
     // We can not make call to such methods using polymorphic reference.
	 // c.display(); 
		

	}

}
