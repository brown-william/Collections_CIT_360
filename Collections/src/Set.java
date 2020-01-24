/*
 * This is the interface List and we will create a class HashSet
 * GROUP 2 CIT360: Luis Cornejo, William, Branden
 * 
 */

/*
 * HashSet doesn’t maintain any order, the elements would be returned in any random order.
HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, the old value would be overwritten.
HashSet allows null values however if you insert more than one nulls it would still return only one null value
 */

import java.util.*;


public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      // HashSet declaration
	      HashSet<String> hashs =  new HashSet<String>();

	      // Add elements
	      
	      hashs.add("car");
	      hashs.add("airplane");
	      hashs.add("truck");
	      hashs.add("ship");
	      hashs.add("train");
	      
	      // Duplicate elements
	      hashs.add("car");
	      hashs.add("ship");
	      
	      //Add null values
	      
	      hashs.add(null);
	      hashs.add(null);
	      hashs.add(null);

	      //Displaying Elements of HashSet
	      System.out.println(hashs);
				

	}

}
