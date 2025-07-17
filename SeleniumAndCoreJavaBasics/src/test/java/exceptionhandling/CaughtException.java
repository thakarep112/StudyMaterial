package exceptionhandling;

public class CaughtException {

	public static void main(String[] args) throws InterruptedException {
		
		int array[] = {10, 20, 30};
		
		Thread.sleep(1000);
		
		System.out.println(array[1]);

	}

}
