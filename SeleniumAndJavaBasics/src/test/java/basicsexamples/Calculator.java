package basicsexamples;

public class Calculator {
	
	
	public int getAdd(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition of 2 numbers is "+sum);
		return sum;
	}
	
	public int getSub(int a, int b)
	{
		int dif=a-b;
		System.out.println("Subtraction of 2 numbers is "+dif);
		return dif;
	}
	
	public int getMul(int a, int b)
	{
		int mul=a*b;
		System.out.println("Multiplication of 2 numbers is "+mul);
		return mul;
	}
	
	public int getDiv(int a, int b)
	{
		int div=a/b;
		System.out.println("Division of 2 numbers is "+div);
		return div;
	}

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.getAdd(10,5);
		calc.getSub(10,3);
		calc.getMul(10,2);
		calc.getDiv(10,10);

	}

}
