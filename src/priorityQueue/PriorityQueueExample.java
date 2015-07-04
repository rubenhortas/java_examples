/**
 * Java 
 * 
 * @author:  Rubén Hortas Astariz <http://rubenhortas.blogspot.com.es>
 * @contact: rubenhortas at gmail.com
 * @web:     http://www.rubenhortas.blogspot.com.es
 * @github:  http://github.com/rubenhortas
 * @license: CC BY-NC-SA 3.0 <http://creativecommons.org/licenses/by-nc-sa/3.0/>
 * @file:    PriorityQueueExample.java
 */

package priorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	
	private static void printQueue(Queue<Integer> q) {
		while(q.peek() != null) {
			System.out.print(q.remove() + " ");
		}
		System.out.println();
	}
	
	/*
	 *  A priority queue says that the element that goes nex is the one with
	 *  the highest priority.
	 *  
	 *  You can modify the order by providing your own Comparator.
	 */
	public static void main(String[] args) {
		
		PriorityQueue<Integer> priorityQueue = null;
				
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			intList.add(i);
		}
		
		// Default Comparator. FIFO.
		priorityQueue = new PriorityQueue<Integer>(intList.size());
		priorityQueue.addAll(intList);
		printQueue(priorityQueue);
		
		// Modifying Comparator. LIFO because Collections.reverseOrder
		priorityQueue = new PriorityQueue<Integer>(intList.size(), Collections.reverseOrder());
		priorityQueue.addAll(intList);
		printQueue(priorityQueue);
	}
}
