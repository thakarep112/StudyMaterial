package inheritence;

public class Animal {
	
	// Types of Inheritance
	// Single Inheritance - When single child is inheriting properties of single parent.
	// Hierarchical - When multiple child's are inheriting properties of single parent.
	// Multiple - When single child is inheriting properties of multiple parents. Not possible in JAVA at class level.
	// Multi-level- When single child is inheriting properties of single parent & again child's child is inheriting its properties.
	// Hybrid- Its combination of Multiple & Other inheritances. Not possible in JAVA at class level.
	
	// Inheritance is possible at below levels by using specific keywords
	// We used extends keyword when....
	// Class is inheriting another Class or Interface is inheriting another Interface.
	// We used implements keyword when....
	// Class is inheriting Interface
	// An Interface can not inherit any Class is JAVA.
	
	// Class level inheritance
	// Single, Hierarchical & Multi-level.
	// Interface level inheritance
	// Single, Hierarchical, Multiple, Hybrid & Multi-level.
	
	
	public void getSound() {
		
		System.out.println("Generate Sound");
		
	}
	
	public void getColor() {
		
		System.out.println("Generate Color");
		
	}

}
