/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    DequeExample.java
 */

package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	/**
	 *  A Deque (double ended queue) is like a queue, but you can add and remove elements from either end.
	 */
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("element 0"); // add element at tail
		deque.addFirst("element 1"); // add element at head
		deque.addLast("element 2"); // add element at tail
		
		System.out.println(deque);
		
		deque.remove();
		deque.removeFirst();
		deque.removeLast();
		
		System.out.println(deque);
	}
}
