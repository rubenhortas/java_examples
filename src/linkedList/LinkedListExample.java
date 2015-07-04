/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    LinkedListExample.java
 */

package linkedList;

import java.util.LinkedList;

import iterator.Item;

/*
 * LinkedList implements List interface like ArrayList, but performs
 * insertion and removal in the middle of the list more efficiently than
 * ArrrayList. It's less efficient for random-access operations.
 */
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Item> items = new LinkedList<Item>(Item.arrayList(10));
		
		System.out.println(items.poll());
		
		System.out.println("List: " + items);
		
		items.addFirst(new Item(00));
		System.out.println("After addFirst(): " + items);
		
		items.offer(new Item(99));
		System.out.println("After offer(): " + items);
		
		items.add(new Item(100));
		System.out.println("After add(): " + items);
		
		items.addLast(new Item(101));
		System.out.println("After addLast(): " + items);
		
		items.removeLast();
		System.out.println("After removeLast(): " + items);
	}

}
