package exceptionhandling;

public class RuntimeExceptions {

	public static void main(String[] args) {
		
		try {
		System.out.println("Begining of coding");
		
		int a=10;
		int b=a/0;
		
		System.out.println("Division is "+b);
		}
		catch(Throwable t) {
			System.out.println("Error Occurred in coding");
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		
		System.out.println("Ending of coding");
	}

}
