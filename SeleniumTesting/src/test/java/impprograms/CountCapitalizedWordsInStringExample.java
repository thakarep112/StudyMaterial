package impprograms;

public class CountCapitalizedWordsInStringExample {
	
	public static int getCapitalizedWordCount(String inputString) {
		
		int counter=0;
		
		for(int i=0; i<inputString.length(); i++) {
			
			if(inputString.charAt(i)>='A' && inputString.charAt(i)<='Z') {
				
				counter++;
			}
		}
		
		return counter;
	}

	public static void main(String[] args) {
		
		System.out.println("Total Capital words present in the given String are : "+getCapitalizedWordCount("RahulShettyAcademy"));
	}

}
