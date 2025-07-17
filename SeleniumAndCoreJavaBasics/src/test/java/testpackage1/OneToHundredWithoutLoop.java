package testpackage1;

public class OneToHundredWithoutLoop {
	
	public static void printNumbers(int num) {
        if (num > 100) {
            return;
        }
        System.out.println(num);
        printNumbers(num + 1);
    }

    public static void main(String[] args) {
    	
        printNumbers(1);
    }
}
