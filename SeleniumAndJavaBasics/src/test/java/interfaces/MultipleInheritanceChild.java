package interfaces;

public class MultipleInheritanceChild extends ParentClass1 implements Parent1, Parent2{

	@Override
	public void add() {
		
		System.out.println("add - MultipleInheritanceChild()");
		
	}

	@Override
	public void show() {
		
		System.out.println("show - MultipleInheritanceChild()");
		
	}
	
	public static void main(String[] args) {
		
		MultipleInheritanceChild mic= new MultipleInheritanceChild();
		mic.add();
		mic.show();
		
		Parent1 mic1= new MultipleInheritanceChild();
		mic1.show();
		
		Parent2 mic2= new MultipleInheritanceChild();
		mic2.add();
		
	}
	
}
