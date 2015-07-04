/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    ListIterator.java
 */

/*
 * The ListIterator is a more powerful subtype of Iterator that is produced only by list classes.
 * ListIterator is bidireccional, can move forward and backward.
 */
package listIterator;

import iterator.Item;

import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {

		// Item class from Iterator example
		List<Item> items = Item.arrayList(10);
		
		ListIterator<Item> it = items.listIterator();
		
		// Forward
		while(it.hasNext()) {
			System.out.println("Item: " + it.next().toString() + "\tNext Index: " + it.nextIndex() + "\tPrevious Index: " + it.previousIndex());
		}
		
		// Backwards
		while(it.hasPrevious()) {
			System.out.println("Item: " + it.previous().toString() + "\tPrevious Index: " + it.previousIndex() + "\tNext Index: " + it.nextIndex());
		}
	}
}
