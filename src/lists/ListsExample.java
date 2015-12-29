/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    ListExample.java
 */

package lists;

import java.util.ArrayList;
import java.util.List;

public class ListsExample {

	public static void main(String[] args) {

		List<String> heroes = new ArrayList<String>();
		
		// Insert some elements
		heroes.add("Batman");
		heroes.add("Green Lantern");
		heroes.add("Hulk");
		heroes.add("Thor");
		System.out.println("Heroes list: " + heroes);
		System.out.println();
		
		// Insert at an index
		heroes.add(0, "Spiderman");
		System.out.println("List after add \"Spiderman\" at 0 postition: " + heroes);
		System.out.println();
		
		// Sublists
		List<String> avengers = heroes.subList(3, 5);
		System.out.println("Heroes list contains avengers: " + heroes.containsAll(avengers));
		System.out.println();
		
		// Copy
		List<String> copyList = new ArrayList<String>(heroes); // Fresh copy
		System.out.println("Copy list: " + copyList);
		System.out.println();
		
		// Remove
		List<String> listToRemove = new ArrayList<String>();
		listToRemove.addAll(heroes.subList(0, 3));
		System.out.println("listToRemove list: " + listToRemove);
		listToRemove.removeAll(avengers); // Removes EXACT objects
		System.out.println("listToRemove list without avengers: " + listToRemove);
		System.out.println();
		
		// Replace an element
		listToRemove.set(2, "Superman");
		System.out.println("listToRemove: " + listToRemove);
		System.out.println();
		
		// Contains
		System.out.println("Avengers contains Hulk = " + avengers.contains("Hulk"));
		System.out.println();
		
		// Get
		System.out.println("Avengers.get(1): " + avengers.get(1));
		System.out.println();
	}
}
