package inheritence;

public class BirmanCat extends Cat {

	public static void main(String[] args) {

		BirmanCat bc = new BirmanCat();
		bc.getSound();
		bc.getColor();
		
		Animal an = new BirmanCat();
		an.getSound();
		an.getColor();
	}
}
