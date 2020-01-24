/*
 * This is the interface List and we will create a class HashMap
 * GROUP 2 CIT360: Luis Cornejo, William, Branden
 * 
 */

/*
 * HashMap is a Map based collection class that is used for storing Key & value pairs,
 * it is denoted as HashMap<Key, Value> or HashMap<K, V>. This class makes no guarantees as
 * to the order of the map. It is similar to the Hashtable class except that it is unsynchronized
 * and permits nulls(null values and null key).
 */

import java.util.*;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap declaration
		HashMap<Integer, String> hashm = new HashMap<Integer, String>();
		
		//Add Elements
		hashm.put(2, "green");
		hashm.put(7, "red");
		hashm.put(4, "white");
		hashm.put(3, "orange");
		hashm.put(5, "blue");
		
		//Display content with iterator
		Set set =hashm.entrySet();
		Iterator iterator = set.iterator();
		
	    while(iterator.hasNext()) {
	          Map.Entry maent = (Map.Entry)iterator.next();
	          System.out.print("The key is: "+ maent.getKey() + " & The Value is: ");
	          System.out.println(maent.getValue());}
	     
	    //Obtain the value based on the key
	    String v = hashm.get(7);
	    System.out.println("The value is: " +v);
	     

	}

}

