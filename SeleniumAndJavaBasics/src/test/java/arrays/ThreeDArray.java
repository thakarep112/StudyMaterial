package arrays;

public class ThreeDArray {

	public static void main(String[] args) {
		
		int [][][] array = new int [2][3][4];
		
		//Printing length of an 3D array.
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[0][0].length);

		//Printing 3D array indexes using for loop.
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				for(int k=0; k<array[i][j].length; k++)
				{
					array[i][j][k] = (int)(Math.random()*1000);
					System.out.print(array[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
