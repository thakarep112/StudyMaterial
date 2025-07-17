package polymorphism;

public class RBI {
	
	public double getHomeLoanInterest() {
		
	return 7.5;	
	
	}
	
    public double getCarLoanInterest() {
		
		return 8.5;
		
	}
    
    public double getBikeLoanInterest() {
		
		return 9.5;
		
	}
    
    public RBI getObject() {
		
    	RBI r = new RBI();
    	return r;
    	
    }
    
    public Number show() {
    	
    	return 10;
    }
    
}
