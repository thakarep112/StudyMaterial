package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		// Creating object of an ArrayList class without using generic.

		ArrayList list = new ArrayList();

		// Storing all types of values in ArrayList.

		list.add(10);
		list.add("Prasad");
		list.add(true);
		list.add(5.20);
		list.add(null);
		list.add('A');
		list.add(10);

		// Printing length of an ArrayList.

		System.out.println("Size of list is : "+list.size());

		// Printing random index vale of an ArrayList

		System.out.println("Value at 0th index is : "+list.get(0));

		// Printing ArrayList

		System.out.println("List values are : "+list);

		// Removing random index value from an ArrayList.

		list.remove(6);
		System.out.println("Updated list values are : "+list);
		System.out.println("Updated list size is : "+list.size());

		// Printing ArrayList using for loop.

		for (int i = 0; i < list.size(); i++) {

			System.out.println("Printing list values through for() loop : "+list.get(i));
		}

		// Printing ArrayList using for each loop.

		for (Object var : list) {

			System.out.println("Printing list values through forEach() loop : "+var);
		}

		// Printing ArrayList using Iterator.

		Iterator itr = list.iterator();

		while (itr.hasNext()) {

			System.out.println("Printing list values through Iterator : "+itr.next());
		}
	}
}
