package basicsexamples;

class MethodBasics {
	
	int a=50;
	
	public void show()
	{
		int i=20;
		System.out.println(i);
	}
	
	public void display()
	{
		int j=10;
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		
	MethodBasics h = new MethodBasics();	
	h.display();
	h.show();
	System.out.println(h.a);
		
	/*
	 * double d= Math.random()*1000;
	 * System.out.println(d); 
	 * Method to generate random number between 0 to 1
	 */
	
	}

}
