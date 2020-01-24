/*
 * This is the interface List and we will create a class ArrayList
 * GROUP 2 CIT360: Luis Cornejo, William, Branden
 * 
 */

/*
 * 
 * import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
 */
import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		//show the elements
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//remove elements
		while (iter.hasNext()) {
			String letter = iter.next();
			if (letter.equals("b")) {
				it.remove();
			}
		}

	}

}
