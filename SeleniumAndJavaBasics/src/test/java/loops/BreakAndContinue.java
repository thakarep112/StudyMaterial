package loops;

public class BreakAndContinue {

	public static void main(String[] args) {
		/*
		 * break- Break statement is used only inside the Loop or Switch. It is used to
		 * Break loop based on condition. Condition is mandatory before writing Break
		 * statement. continue- Continue statement is used only inside the Loop. It is
		 * used to skip loop iterations based on Condition. Condition is mandatory
		 * before writing Continue statement.
		 */
		
		for(int i=0; i<100; i++)
		{
			if(i>=5 && i<=15)
				continue;
			
			if(i==21)
				break;
			
			System.out.println(i);
		}
		
		System.out.println("Out of the loop");
		
	}
}
