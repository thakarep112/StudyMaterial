package exceptionhandling;

public class UncaughtException {

	public static void main(String[] args) throws Exception {
		
		int array[] = {10, 20, 30};
		
		System.out.println(array[0]);
		
		throw new Exception("Error Occurred");
		
	}
}
