package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {

	public static void main(String[] args) {
		
		// Creating object of an ArrayList class using Generic <Integer>.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// We can not stored values apart from defined type in the list.
		// Storing integer values in ArrayList.
		
		list.add(10);
		list.add(20);
		list.add(10);
		
		System.out.println("Size of list is : "+list.size());
		int a = list.get(0);
		System.out.println("Value of a is : "+a);
		System.out.println("List values are : "+list);
		
		// Creating object of an ArrayList class using Generic <String>.

		List<String> list1 = new ArrayList<String>();

		// Storing string values in ArrayList.

		list1.add("Prasad");
		list1.add("Ganesh");
		list1.add("Thakare");
		list1.add("Savita");
		
		System.out.println("Size of list is : "+list1.size());
		String s = list1.get(0);
		System.out.println("Value of a is : "+s);
		System.out.println("List values are : "+list1);
		
	}
}
