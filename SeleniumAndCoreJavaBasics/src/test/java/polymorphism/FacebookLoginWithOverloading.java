package polymorphism;

public class FacebookLoginWithOverloading {
	
	int mobileNo= 12345;
	String password= "Prasad12345";
	String userName= "thakarep112";
	
	public void doLogin(int mobileNo, String password){
		
		System.out.println("Successfully logged in using mobile number");
	}
	
    public void doLogin(String userName, String password){
		
		System.out.println("Successfully logged in using usename");

	}

	public static void main(String[] args) {
		
		FacebookLoginWithOverloading fl = new FacebookLoginWithOverloading();
		fl.doLogin(12345, "Prasad12345");
		fl.doLogin("thakarep112", "Prasad12345");
		
	}

}
