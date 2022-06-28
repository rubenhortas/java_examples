package queues.deque;

import java.util.ArrayDeque;

public class Deque {
    // A Deque (double ended queue) is like a queue, but you can add and remove elements from either end.
    public static void main(String[] args) {
        java.util.Deque<String> deque = new ArrayDeque<>();

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
