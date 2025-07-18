package impprograms;

public class LongestConsecutiveOccurenceExample {

	public static void main(String[] args) {
		
		int [] array = {10, 2, 8, 3, 4, 5, 6, 1};
		
		int counter=0;
		int max = 0;
		
		for(int i=0; i<array.length-1; i++) {
			
			if(array[i]+1 == array[i+1]) {
				
				counter++;
			}else {
				
				counter=0;
			}
			
			max = Math.max(max, counter+1);
		}
		
		System.out.println("Longest Consecutive Occurence of numbers are : "+max);

	}
}
