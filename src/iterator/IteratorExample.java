/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    IteratorExample.java
 */

package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lists.Item;

public class IteratorExample {
	
	public static void main(String[] args) {
	
		List<Item> itemList = new ArrayList<Item>();

		itemList.add(new Item(1, "One"));
		itemList.add(new Item(2, "Two"));
		itemList.add(new Item(3, "Three"));
		itemList.add(new Item(4, "Four"));
		
		Iterator<Item> it = itemList.iterator();
		
		while(it.hasNext()) {
		
			Item i = it.next();
			System.out.println(i.number + " - " + i.description);
		}
	}
}
