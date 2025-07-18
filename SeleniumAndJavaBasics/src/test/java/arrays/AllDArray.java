package arrays;

public class AllDArray {
	
	public void getOneDArray()
	{
		int [] array1 = new int [3];
		
		for(int i=0; i<array1.length; i++)
		{
			array1[i] = (int)(Math.random()*1000);
			System.out.println(array1[i]+" ");
		}
	}
	
	public void getTwoDArray()
	{
	
        int [][] array2 = new int [3][3];
		
		for(int i=0; i<array2.length; i++)
		{
			for(int j=0; j<array2[i].length; j++)
			{
			  array2[i][j] = (int)(Math.random()*1000);
			  System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void getThreeDArray()
	{
		int [][][] array3 = new int [3][3][3];
		
		for(int i=0; i<array3.length; i++)
		{
			for(int j=0; j<array3[i].length; j++)
			{
				for(int k=0; k<array3[i][j].length; k++)
				{
					array3[i][j][k] = (int)(Math.random()*1000);
					System.out.print(array3[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		AllDArray a= new AllDArray();
		a.getThreeDArray();
		
	}

}
