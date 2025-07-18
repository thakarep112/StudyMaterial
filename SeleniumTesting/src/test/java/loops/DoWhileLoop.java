package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		/*
		 * Do While loop- It is same as while loop. Only difference is, do loop always
		 * execute for the 1st time without checking the Condition. After execution of
		 * 1st cycle condition is checked and based on that loop continue further.
		 */
		
		int i=1;
		
		do{
			
			System.out.println(i);
			i++;
			
		}
		while(i<=10);
		System.out.println("Out of loop");
	}

}
