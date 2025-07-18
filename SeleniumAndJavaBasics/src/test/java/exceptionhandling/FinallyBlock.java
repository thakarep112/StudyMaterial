package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
	try {
		
		System.out.println("Database connections are turn on");
		
		int array[] = {1, 2, 3, 4};
		System.out.println(array[5]);
		
		}
	catch(Throwable t)
		{
			
			System.out.println("Error Occurred");
			t.getMessage();
			t.printStackTrace();
			
		}
	
	finally 
	   {
		
		System.out.println("Database connections are turn off");
		
	   }
		
		
	}

}
