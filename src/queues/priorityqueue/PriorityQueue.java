package queues.priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class PriorityQueue {
    private static void printQueue(Queue<Integer> q) {
        while (q.peek() != null) {
            System.out.print(q.remove() + " ");
        }

        System.out.println();
    }

    /* A priority queue says that the element that goes next is the one with
       the highest priority.
       You can modify the order by providing your own Comparator. */
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> priorityQueue;
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }

        // Default Comparator. FIFO.
        priorityQueue = new java.util.PriorityQueue<>(intList.size());
        priorityQueue.addAll(intList);
        printQueue(priorityQueue);

        // Modifying Comparator. LIFO because Collections.reverseOrder
        priorityQueue = new java.util.PriorityQueue<>(intList.size(), Collections.reverseOrder());
        priorityQueue.addAll(intList);
        printQueue(priorityQueue);
    }
}
