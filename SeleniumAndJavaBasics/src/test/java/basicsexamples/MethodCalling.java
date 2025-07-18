package basicsexamples;

public class MethodCalling {

	public static void main(String[] args) {
		
		MethodCalling m = new MethodCalling();
		m.go2();
		System.out.println("After Calling Go2 Method");
	}
	
	public void go1() {
		System.out.println("Inside Go1 Method");
		go3();
		System.out.println("After Calling Go3 Method");
	}
	
	public void go2() {
		System.out.println("Inside Go2 Method"); 
		go1();
		System.out.println("After Calling Go1 Method");
	}
	
	public void go3() {
		System.out.println("Inside Go3 Method");
	}

}
