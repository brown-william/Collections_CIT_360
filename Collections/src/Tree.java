/*
 * This is the interface List and we will create a class TreeMap
 * GROUP 2 CIT360: Luis Cornejo, William, Branden
 * 
 */

/*
 * TreeMap class implements Map interface similar to HashMap class. 
 * The main difference between them is that HashMap is an unordered collection 
 * while TreeMap is sorted in the ascending order of its keys. TreeMap is unsynchronized 
 * collection class which means it is not suitable for thread-safe operations until unless 
 * synchronized explicitly.
 */

import java.util.*;


public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      // TreeMap declaration
		  TreeMap<Integer, String> treem = new TreeMap<Integer, String>();

	      // Add elements
	      
		  treem.put(8, "1stGrade");
		  treem.put(5, "2ndGrade");
		  treem.put(7, "3rdGrade");
		  treem.put(3, "4rtGrade");
		  treem.put(9, "5ftGrade");
	      
		//Display content with iterator
	      Set set = treem.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry maent = (Map.Entry)iterator.next();
	         System.out.print("The key is: "+ maent.getKey() + " & The Value is: ");
	         System.out.println(maent.getValue());
	      }
				

	}

}
