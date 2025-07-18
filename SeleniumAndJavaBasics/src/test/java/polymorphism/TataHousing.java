package polymorphism;

public class TataHousing extends RBI{
	
	 public TataHousing getObject() {
		  
		 TataHousing th = new TataHousing(); 
			return th;
		  
		 }
	 
	    public Integer show() {
	    	
	    	return 15;
	    }

	public static void main(String[] args) {

		RBI th = new TataHousing();     //RBI(Parent class)- Polymorphic Reference
		System.out.println(th.getObject());
		System.out.println(th.show());


	}

}
