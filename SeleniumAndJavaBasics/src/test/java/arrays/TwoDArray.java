package arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
		// Creation/Declaration of an 2D array.
		
		int [][] array = new int [2][3];
		
		// Defined array indexes for 2D arrays.
		
		array[0][0]= 10;
		array[0][1]= 20;
		array[0][2]= 30;
		
		array[1][0]= 40;
		array[1][1]= 50;
		array[1][2]= 60;
		
		// Printing any single index of 2D array.
		
		System.out.println(array[0][1]);
		System.out.println(array[1][2]);
		
		//Printing length of an 2D array.
		
		System.out.println(array.length);
		
		//Printing length of 0th & 1st indexes of an 2D array.
		
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		
		//Printing 2D array indexes using for loop.
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
