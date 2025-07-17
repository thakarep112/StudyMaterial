package polymorphism;

public class TDSBank extends RBI {
	
	public double getHomeLoanInterest() {
		
	return 7.75;	
	
	}
	
    public double getCarLoanInterest() {
		
		return 8.85;
		
	}
    
    public double getBikeLoanInterest() {
		
		return 9.95;
		
	}
    
	 public TDSBank getObject() {
		  
		 TDSBank tds = new TDSBank();
		return tds;
	  
	 }

	public static void main(String[] args) {

		TDSBank tb = new TDSBank();
		System.out.println(tb.getHomeLoanInterest());
		System.out.println(tb.getCarLoanInterest());
		System.out.println(tb.getBikeLoanInterest());
		System.out.println(tb.getObject());
		
	}

}
