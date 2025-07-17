package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		// Creating object of the HashMap class.

		Map<String,String> map = new HashMap<String,String>();
		
		// Storing string values in HashMap in Key & Value pair.
		
		map.put("userName","Prasad");
		map.put("education","BE");
		map.put("company","CeX");
		map.put("address","Vasind");
		
		// Printing length of the HashMap.
		
		System.out.println("Size of map is : "+map.size());
		
		// Printing HashMap.
		
		System.out.println("Map values are : "+map);
		
		// Printing Value from HashMap using Key.
		
		System.out.println(map.get("userName"));
		
		// Printing all values stored in HashMap in Key & Value pair.
		// 1st fetching all the keys from HashMap and storing in reference variable.
		
		Set<String> keys = map.keySet();
		
		// Printing values of all the keys using for each loop.
		
		for(String key : keys) {
			
			System.out.println("Key--> "+key+" & "+"Value--> "+map.get(key));	
		}
		
		// Complex HashMap Example.
		
		Map<String,List<String>> map1 = new HashMap<String,List<String>>();
		
		List<String> listofEmails = new ArrayList<String>();
		
		listofEmails.add("thakarep112@gmail.com");
		listofEmails.add("pthakare@webuy.com");
		listofEmails.add("thakarep1121@gmail.com");
		
		map1.put("Email", listofEmails);
		
	}

}
