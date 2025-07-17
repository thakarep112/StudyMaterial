package polymorphism;

public class SBI extends RBI {
	
	public double getHomeLoanInterest() {
		
	return 9;	
	
	}
	
    public double getCarLoanInterest() {
		
		return 10;
		
	}
    
    public double getBikeLoanInterest() {
		
		return 11;
		
	}
	
	 public TDSBank getObject() {
	  
		 TDSBank tb = new TDSBank(); 
		 return tb;
	  
	 }
	 

	public static void main(String[] args) {
		
		SBI s = new SBI();
		System.out.println(s.getHomeLoanInterest());
		System.out.println(s.getCarLoanInterest());
		System.out.println(s.getBikeLoanInterest());
		System.out.println(s.getObject());
	}

}
