package arrays;

public class OneDArray {

	public static void main(String[] args) {
		
	// Array Element- Each value/variable stored inside of an array is called as an array element.
	// Array Index- It is the index of an each value/variable stored inside of an array.
	// Array index is always start from 0. 
	// Index of a last value/variable stored inside an array is	array.length-1.
	// Array Length- Length of an array.	
		
		// Creation/Declaration of an 1D array.
		
		int[] array = new int[5];
		
		// Array indexes defined manually. Undefined index will be 0/00/null based on data type.
		
		array[0] = 10;
		array[1] = 20;  
		array[2] = 30;
		array[4] = 50;
		
		//Printing length of an array. length- Final variable of array class.
		
		System.out.println("Length of an array is " +array.length);
		
		// Printing any single index of an array.
		
		System.out.println("Array index-4 value is "+array[4]);
		
		// Printing all manually defined array indexes using for loop.
		
		  for(int index=0; index<array.length; index++)
		   {
			System.out.println(array[index]);
			
		   }
			
			//Defined array indexes using for loop & then printing the values.
			
			for(int index=0; index<array.length; index++)
			{
				array[index] = (int)(Math.random()*100);
				
				System.out.println(array[index]);
			}
			
			// Printing array indexes in reverse order using for loop
			
			System.out.println("Reverse order is");
			
			for(int index=array.length-1; index>=0; index--)
			{
				System.out.println(array[index]);
			}
			
			// Printing array indexes using for-each loop. 
			// You can only print forward values using for-each loop.
			
			for(int var:array)
			{
				System.out.println(var);
			}
			
			// Hard coding array indexes by using different method.
			// This is not an ideal way to defined an 1D array.
			
			int[] array1 = {5,10,15,20,25};
			
			System.out.println("Length of an array is " +array1.length);
			
			for(int index=0; index<array.length; index++)
			   {
				System.out.println(array1[index]);
				
			   }
			
		}
	}

