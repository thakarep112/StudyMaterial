package polymorphism;

public class OverLoadingExamples {
	
	// Polymorphism- Same name + Multiple forms(action/behavior)
	// Compile Time Polymorphism/Early Binding/Static Binding/Overloading
	// Creating overloaded methods- Same method name within same class but with signatures.
	// Example 1
	
    public void add(int a, int b) {
    	
    	int sum=a+b;
    	System.out.println("Addition of 2 numbers "+sum);
	
    }
    
    public void add(int a, int b, int c) {
    	
    	int sum=a+b+c;
    	System.out.println("Addition of 3 numbers "+sum);
	
    }
    
    // Example 2
    
    
    public void test() {
    	 
    	System.out.println("Test Class");
    }
    
    public void test(int a) {
    	
    	System.out.println("Test Class "+a);
    	
    }
    
    public void test(int a, String b) {
    	
    	System.out.println("Test Class "+a+" "+b);
    	
    }
    
    public void test(String a, int b) {
    	
    	System.out.println("Test Class "+a+" "+b);
    	
    }
    
    // Example 3
    
    public void sub(int a, int b) {
    	
    	System.out.println("Integer Method");
    	
    }
    
    public void sub(byte b1, byte b2) {
    	
    	System.out.println("Byte Method");
    	
    }
    
    
    // Example 4
    // varargs- The variable argument allows the method to accept zero or multiple arguments.
    
    public void getAddition(int ...a) {
    	
    	System.out.println("Variable Arguments");
    	
		 for(int b:a) { 
			 
			 System.out.println(b); 
			 
		 }
		 
    }
    

	public static void main(String[] args) {
		
		OverLoadingExamples olx = new OverLoadingExamples();
		olx.add(5, 10);
		olx.add(5, 10, 20);
		
		olx.test();
		olx.test(10);
		olx.test(50, "Prasad");
		olx.test("Thakare", 20);
		
		olx.sub(1, 2);
		byte b1=10;
		byte b2=20;
		olx.sub(b1,b2);
		
		olx.getAddition(10, 20, 30);

	}

}
