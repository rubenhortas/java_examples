/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    StackExample.java
 */

package stack;

import iterator.Item;

import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// Item class from Iterator example
		Stack<Item> stack = new Stack<Item>();
		List<Item> items = Item.arrayList(10);
		
		for(Item item : items) {
			stack.push(item);
		}
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}
