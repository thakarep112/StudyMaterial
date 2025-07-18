package constructors;

public class Student {
	
	
	// No Argument Constructor
	
	public Student() {
		
		System.out.println("This is calling through constructor");
	}
	
	// Parameterized Constructor
	// Constructor overloading
	
    public Student(int i) {
		
		System.out.println("Value of i is "+i);
	}
	
	
	String studentName;
	int rollNo;
	
	public Student(String studentName, int rollNo) {
		
		// Constructor chaining- Calling constructor within a constructor.
		
		this();  // or this(10);
		
		// Assigned local variable value into a global variable.
		// Referring Global variable using this keyword

		this.studentName=studentName; 
		this.rollNo=rollNo;
		System.out.println(studentName);
		
	}

	public static void main(String[] args) {
		
		// Non-argumented constructor will get called.
		
		new Student(); 
		
		// Constructor with arguments will get called.
		
		Student st1 = new Student("Prasad", 100);
		System.out.println(st1.rollNo);
		
		new Student(10);
		
	}

}
