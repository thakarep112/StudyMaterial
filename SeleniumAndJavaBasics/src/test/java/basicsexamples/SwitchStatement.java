package basicsexamples;

public class SwitchStatement {
	
	/* Switch statement using method */
	
	public int getCase(int day) {
		
		switch(day) {
		case 1: 
			System.out.println("Its Monday !!");
			break;
		case 2:
			System.out.println("Its Tuesday !!");
			break;
		case 3:
			System.out.println("Its Wednsday !!");
			break;
		case 4:
			System.out.println("Its Thursday !!");
			break;
		case 5:
			System.out.println("Its Friday !!");
			break;
		case 6:
			System.out.println("Its Saturday !!");
			break;
		case 7:
			System.out.println("Its Sunday !!");
			break;
		default:
			System.out.println("We have only 7 valid days. Please enter between 1 to 7 days only !!");
			break;
		}
		return day;
	}

	public static void main(String[] args) {
		
		SwitchStatement s = new SwitchStatement();
		s.getCase(4);
		
		/*Direct way to used Switch statement
		int day = 2;
		
		switch(day) {
		case 1: 
			System.out.println("Its Monday !!");
			break;
		case 2:
			System.out.println("Its Tuesday !!");
			break;
		case 3:
			System.out.println("Its Wednsday !!");
			break;
		case 4:
			System.out.println("Its Thursday !!");
			break;
		case 5:
			System.out.println("Its Friday !!");
			break;
		case 6:
			System.out.println("Its Saturday !!");
			break;
		case 7:
			System.out.println("Its Sunday !!");
			break;
		default:
			System.out.println("We have only 7 valid days. Please enter between 1 to 7 days only !!");*/
		}
	}

