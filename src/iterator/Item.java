/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    Item.java
 */

package iterator;

import java.util.ArrayList;
import java.util.List;

public class Item {

	public Integer number;
	public String description;
	
	public Item(Integer number, String description) {
		this.number = number;
		this.description = description;
	}
	
	/*
	 * Returns an array list of n Item elements.
	 */
	public static List<Item> arrayList(int n) {
		
		List<Item> itemList = new ArrayList<Item>(n);
		
		for(int i=0; i<n; i++) {
			Item newItem = new Item(i, String.format("Item %d", i));
			itemList.add(newItem);
		}
		
		return itemList;
	}
}
