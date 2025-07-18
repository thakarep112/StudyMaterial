package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		// Creating object of an HashSet class with Generic.

		HashSet<String> set = new HashSet<String>();
		
		// Storing string values in HashSet.
		
		set.add("Prasad");
		set.add("Love");
		set.add("Savita");
		set.add("Shweta");
		set.add("Shweta");

		// Printing length of an HashSet.
		
		System.out.println("Size of set is : "+set.size());
		
		// Printing HashSet.
		
		System.out.println("Set values are : "+set);
		
		// Removing value from HashSet
		
		set.remove("Love");
		System.out.println("Updated set size is : "+set.size());
		System.out.println("Updated set values are : "+set);
		
		// Printing HashSet values using for each loop.
		
		for(String var : set) {
			
			System.out.println("Printing set values using forEach loop : "+var);
		}

		// Printing random value from HashSet using Iterator.
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			String var = itr.next();
			if(var.equals("Shweta"))
			System.out.println("Printing Shweta value using Iteration : "+var);
		}
	}
}
